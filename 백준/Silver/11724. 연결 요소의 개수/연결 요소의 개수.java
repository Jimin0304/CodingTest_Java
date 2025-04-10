import java.util.Scanner;

class Main {
    static boolean[][] connected;
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        connected = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            connected[a][b] = connected[b][a] = true;
        }

        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }

    public static void dfs(int start) {
        if (visited[start])
            return ;
        visited[start] = true;
        for (int i = 1; i < connected.length; i++) {
            if (connected[start][i] == true)
                dfs(i);
        }
    }
}