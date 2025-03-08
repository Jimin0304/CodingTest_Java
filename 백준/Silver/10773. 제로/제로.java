import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < K; i++) {
            int now = sc.nextInt();
            if (now == 0)
                st.pop();
            else
                st.push(now);
        }
        // 최종 합
        int total = 0;
        while (!st.isEmpty()) {
            total += st.pop();
        }
        System.out.println(total);
    }
}