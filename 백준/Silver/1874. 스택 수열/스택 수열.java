import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int now = 1;
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            while (now <= num && now <= n) {
                st.push(now++);
                sb.append("+\n");
            }
            if (st.peek().intValue() == num) {
                st.pop();
                sb.append("-").append('\n');
            } else {
                System.out.println("NO");
                return ;
            }
        }
        System.out.println(sb.toString());
    }
}