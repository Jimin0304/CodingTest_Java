class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        boolean[] visited = new boolean[after.length()];
        
        for (int i = 0; i < before.length(); i++) {
            for (int j = 0; j < visited.length; j++) {
                if (visited[j]) continue ;
                if (before.charAt(i) == after.charAt(j)) {
                    visited[j] = true;
                    break ;
                }
            }
        }
        
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                answer = 0;
                break ;
            }
        }
        
        return answer;
    }
}