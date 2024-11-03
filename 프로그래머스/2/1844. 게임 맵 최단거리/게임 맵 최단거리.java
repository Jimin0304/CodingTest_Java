import java.util.*;

class Coordinate {
    int x;
    int y;
    
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;    // 도착할 수 없을 때
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int[][] distance = new int[maps.length][maps[0].length];
        
        Queue<Coordinate> q = new LinkedList<>();
        q.offer(new Coordinate(0, 0));
        visited[0][0] = true;
        distance[0][0] = 1;
        
        // 위 아래 왼 오
        int[] x = {0, 0, -1, 1};
        int[] y = {-1, 1, 0, 0};
        
        while (!q.isEmpty()) {
            Coordinate now = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nowX = now.x + x[i];
                int nowY = now.y + y[i];
                
                if (nowX < 0 || nowX >= maps[0].length || nowY < 0 || nowY >= maps.length) continue ;
                if (visited[nowY][nowX]) continue ;
                if (maps[nowY][nowX] == 0) continue ;
                
                visited[nowY][nowX] = true;
                q.offer(new Coordinate(nowX, nowY));
                distance[nowY][nowX] = distance[now.y][now.x] + 1;
                
                if (nowX == maps[0].length - 1 && nowY == maps.length - 1)
                    return distance[nowY][nowX];
            }
        }
        
        return answer;
    }
}