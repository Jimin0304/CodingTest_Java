class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String b : babbling) {
            String pre = "";
            boolean cannot = false;
            while (b.length() > 3) {
                if (b.substring(0, 3).equals(pre) || b.substring(0, 2).equals(pre)) {   // 연속으로 같은 거 발음
                    cannot = true;
                    break ;
                }
                if (b.substring(0, 3).equals("aya") || b.substring(0, 3).equals("woo")) {
                    pre = b.substring(0, 3);
                    b = b.substring(3);
                }
                else if (b.substring(0, 2).equals("ye") || b.substring(0, 2).equals("ma")) {
                    pre = b.substring(0, 2);
                    b = b.substring(2);
                }
                else {
                    cannot = true;
                    break ;
                }
            }
            if (cannot)
                continue ;
            if (b.equals(pre))
                continue ;
            if (b.length() == 3 && (b.equals("aya") || b.equals("woo")))
                answer++;
            else if (b.length() == 2 && (b.equals("ye") || b.equals("ma")))
                answer++;
        }
        
        return answer;
    }
}