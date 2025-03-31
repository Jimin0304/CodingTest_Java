import java.util.Scanner;

class Main {
    static boolean[] visited;
    static int[][] list;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerCnt = sc.nextInt();
        int networkCnt = sc.nextInt();

        visited = new boolean[computerCnt  + 1];
        list = new int[computerCnt  + 1][computerCnt  + 1];

        for (int i = 0; i < networkCnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a][b] = list[b][a] = 1;
        }

        dfs(1);
        int result = 0;
        for (int i = 2; i < visited.length; i++) {
            if (visited[i])
                result++;
        }
        System.out.println(result);
    }

    public static void dfs(int start) {
        visited[start] = true;
        for (int i = 1; i < list.length; i++) {
            if (list[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}