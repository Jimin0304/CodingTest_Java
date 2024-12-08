import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        Arrays.fill(answer, -1);
        
        for (int y = 0; y < wallpaper.length; y++) {
            for (int x = 0; x < wallpaper[y].length(); x++) {
                if (wallpaper[y].charAt(x) == '#') {
                    if (answer[0] == -1) {
                        answer[0] = y;
                        answer[2] = y + 1;
                        answer[1] = x;
                        answer[3] = x + 1;
                    }
                    if (answer[0] > y) answer[0] = y;
                    else if (answer[2] < y + 1) answer[2] = y + 1;
                    if (answer[1] > x) answer[1] = x;
                    else if (answer[3] < x + 1) answer[3] = x + 1;
                }
            }
        }
        return answer;
    }
}