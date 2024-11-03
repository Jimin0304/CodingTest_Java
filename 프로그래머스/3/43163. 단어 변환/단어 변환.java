import java.util.*;

class Solution {
    public boolean checkOneAlpha(String now, String word) {
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (now.charAt(i) != word.charAt(i))
                cnt++;
        }
        if (cnt == 1)
            return true;
        return false;
    }
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        int[] cnt = new int[words.length];
        
        Queue<String> q = new LinkedList<>();
        q.offer(begin);
        while (!q.isEmpty()) {
            String now = q.poll();
            
            for (int i = 0; i < words.length; i++) {
                if (visited[i]) continue ;
                if (!checkOneAlpha(now, words[i])) continue ;
                
                visited[i] = true;
                q.offer(words[i]);
                int index = 0;
                while (index < words.length - 1) {
                    if (words[index].equals(now))
                        break ;
                    index++;
                }
                cnt[i] = cnt[index] + 1;
                
                if (words[i].equals(target))
                    return cnt[i];
            }
        }

        return answer;
    }
}