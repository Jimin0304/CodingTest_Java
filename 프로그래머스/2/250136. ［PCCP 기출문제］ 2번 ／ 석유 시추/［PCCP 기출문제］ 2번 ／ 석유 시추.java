import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.ArrayList;

class Coordinate {
    int x;
    int y;
        
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    
    public void bfs(int x, int y, int[][] land, boolean[][] visited, HashMap<Integer, Integer> map, int index) {
        Queue<Coordinate> q = new LinkedList<>();
        int fuel = 0;
        
        q.offer(new Coordinate(x, y));
        visited[y][x] = true;
        land[y][x] = index;
        fuel++;
        
        while (!q.isEmpty()) {
            Coordinate now = q.poll();
            
            if (now.x > 0 && land[now.y][now.x - 1] == 1 && !visited[now.y][now.x - 1]) {
                q.offer(new Coordinate(now.x - 1, now.y));
                visited[now.y][now.x - 1] = true;
                fuel++;
                land[now.y][now.x - 1] = index;
            }
            if (now.x < land[0].length - 1 && land[now.y][now.x + 1] == 1 && !visited[now.y][now.x + 1]) {
                q.offer(new Coordinate(now.x + 1, now.y));
                visited[now.y][now.x + 1] = true;
                fuel++;
                land[now.y][now.x + 1] = index;
            }
            if (now.y > 0 && land[now.y - 1][now.x] == 1 && !visited[now.y - 1][now.x]) {
                q.offer(new Coordinate(now.x, now.y - 1));
                visited[now.y - 1][now.x] = true;
                fuel++;
                land[now.y - 1][now.x] = index;
            }
            if (now.y < land.length - 1 && land[now.y + 1][now.x] == 1 && !visited[now.y + 1][now.x]) {
                q.offer(new Coordinate(now.x, now.y + 1));
                visited[now.y + 1][now.x] = true;
                fuel++;
                land[now.y + 1][now.x] = index;
            }
        }
        
        map.put(index, fuel);
    }
    
    public int solution(int[][] land) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 2;
        boolean[][] visited = new boolean[land.length][land[0].length];
        
        for (int i = 0 ; i < land[0].length; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int fuel = 0;
            for (int j = 0; j < land.length; j++) {
                if (land[j][i] > 1 && !arr.contains(land[j][i]))
                    arr.add(land[j][i]);
                if (land[j][i] == 1 && !visited[j][i]) {
                    bfs(i, j, land, visited, map, index);
                    arr.add(index++);
                }
            }
            for (int num : arr) {
                fuel += map.get(num);
            }
            if (fuel > max)
                max = fuel;
        }
            
        return max;
    }
}