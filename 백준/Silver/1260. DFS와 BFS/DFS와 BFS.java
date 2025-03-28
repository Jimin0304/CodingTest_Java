import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    static boolean[] visited;
    static int[][] list;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        visited = new boolean[N  + 1];
        list = new int[N  + 1][N  + 1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a][b] = list[b][a] = 1;
        }

        dfs(V);
        sb.append("\n");
        visited = new boolean[N  + 1];
        bfs(V);

        System.out.println(sb.toString());
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
        for (int i = 1; i < list.length; i++) {
            if (list[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            sb.append(now).append(" ");
            for (int i = 1; i < list.length; i++) {
                if (list[now][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }

        }
    }
}