import java.io.*;
import java.util.*;

public class Main {
    static class Pair {
        int position;
        int height;

        Pair(int position, int height) {
            this.position = position;
            this.height = height;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        Stack<Pair> pair = new Stack<>();
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (pair.isEmpty()) {
                System.out.print("0 ");
                pair.push(new Pair(i + 1, now));
            }
            else {
                while (!pair.isEmpty()) {
                    if (pair.peek().height < now) pair.pop();
                    else {
                        System.out.print(pair.peek().position + " ");
                        pair.push(new Pair(i + 1, now));
                        break ;
                    }
                }
                if (pair.isEmpty()) {
                    System.out.print("0 ");
                    pair.push(new Pair(i + 1, now));
                }
            }
        }
    }
}