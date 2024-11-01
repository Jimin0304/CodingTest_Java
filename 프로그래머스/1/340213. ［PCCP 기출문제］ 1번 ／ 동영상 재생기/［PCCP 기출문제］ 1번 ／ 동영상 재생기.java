class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        int position = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        int startOp = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int endOp = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));
        
        for (int i = 0; i < commands.length; i++) {
            // opening
            if (position >= startOp && position <= endOp)
                position = endOp;
            
            // commands
            if(commands[i].equals("next")) {
                if (position + 10 > video)
                    position = video;
                else
                    position += 10;
            }
            else if (commands[i].equals("prev")) {
                if (position < 10)
                    position = 0;
                else
                    position -= 10;
            }
        }
        if (position >= startOp && position <= endOp)
            position = endOp;
        
        String m = "";
        if ((position / 60) < 10)
            m = "0" + String.valueOf(position/60);
        else
            m = String.valueOf(position/60);
        
        String s = "";
        if ((position % 60) < 10)
            s = "0" + String.valueOf(position%60);
        else
            s = String.valueOf(position%60);
        
        return m + ":" + s;
    }
}