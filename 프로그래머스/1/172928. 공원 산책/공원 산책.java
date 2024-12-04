class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        Character[][] map = new Character[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                map[i][j] = park[i].charAt(j);
                if (map[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        for (String route : routes) {
            String[] split_result = route.split(" ");
            int len = Integer.parseInt(split_result[1]);
            boolean check = false;
            if (split_result[0].equals("N")) {
                for (int i = answer[0]; i >= answer[0] - len; i--) {
                    if (i < 0 || map[i][answer[1]] == 'X') {
                        check = true;
                        break; 
                    }                      
                }
                if (check)
                    continue ;
                answer[0] -= len;
            }
            else if (split_result[0].equals("S")) {
                for (int i = answer[0]; i <= answer[0] + len; i++) {
                    if (i >= map.length || map[i][answer[1]] == 'X') {
                        check = true;
                        break; 
                    }                      
                }
                if (check)
                    continue ;
                answer[0] += len;
            }
            else if (split_result[0].equals("E")) {
                for (int i = answer[1]; i <= answer[1] + len; i++) {
                    if (i >= map[0].length || map[answer[0]][i] == 'X') {
                        check = true;
                        break; 
                    }                      
                }
                if (check)
                    continue ;
                answer[1] += len;
            }
            else if (split_result[0].equals("W") && answer[1] - len >= 0) {
                for (int i = answer[1]; i >= answer[1] - len; i--) {
                    if (i < 0 || map[answer[0]][i] == 'X') {
                        check = true;
                        break; 
                    }                      
                }
                if (check)
                    continue ;
                answer[1] -= len;
            }
        }
        return answer;
    }
}