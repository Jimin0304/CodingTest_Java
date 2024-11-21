import java.util.*;

class Solution {
    public String makeStr(int nowX, int nowY, int nextX, int nextY) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("(").append(nowX).append(", ").append(nowY).append(")");
        sb.append(" -> ");
        sb.append("(").append(nextX).append(", ").append(nextY).append(")");
        
        return sb.toString();
    }
    
    public int solution(String dirs) {
        int answer = 0;
        List<String> road = new ArrayList<>();
        
        int x = 5;
        int y = 5;
        for (int i = 0; i < dirs.length(); i++) {
            switch(dirs.charAt(i)) {
                case 'U':
                    if (y < 10) {
                        if (!road.contains(makeStr(x, y, x, y + 1))) {
                            answer++;
                            road.add(makeStr(x, y, x, y + 1));
                            road.add(makeStr(x, y + 1, x, y));
                        }
                        y++;
                    }
                    break ;
                case 'D':
                    if (y > 0) {
                        if (!road.contains(makeStr(x, y, x, y - 1))) {
                            answer++;
                            road.add(makeStr(x, y, x, y - 1));
                            road.add(makeStr(x, y - 1, x, y));
                        }
                        y--;
                    }
                    break ;
                case 'R':
                    if (x < 10) {
                        if (!road.contains(makeStr(x, y, x + 1, y))) {
                            answer++;
                            road.add(makeStr(x, y, x + 1, y));
                            road.add(makeStr(x + 1, y, x, y));
                        }
                        x++;
                    }
                    break ;
                case 'L':
                    if (x > 0) {
                        if (!road.contains(makeStr(x, y, x - 1, y))) {
                            answer++;
                            road.add(makeStr(x, y, x - 1, y));
                            road.add(makeStr(x - 1, y, x, y));
                        }
                        x--;
                    }
                    break ;    
            }
        }
        
        return answer;
    }
}