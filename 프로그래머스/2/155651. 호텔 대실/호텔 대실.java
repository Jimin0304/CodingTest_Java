import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (o1, o2) -> {
            return changeTimeToInt(o1[0]) - changeTimeToInt(o2[0]);
        });
        List<Integer> room = new ArrayList<>();
        room.add(changeTimeToInt(book_time[0][1]) + 10);
        
        for (int i = 1; i < book_time.length; i++) {
            int inTime = changeTimeToInt(book_time[i][0]);
            int outTime = changeTimeToInt(book_time[i][1]) + 10;
            
            boolean check = false;
            for (Integer time : room) {
                if (time <= inTime) {
                    room.remove(time);
                    room.add(outTime);
                    check = true;
                    break ;
                }
            }
            if (!check) {   // 남는 방 없을 때
                room.add(outTime);
            }
        }
        
        return room.size();
    }
    
    public int changeTimeToInt(String time) {
        String[] str = time.split(":");
        return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
    }
}