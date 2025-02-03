import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println(solve(input.next()));
		}
	}
    
    public static String solve(String str) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String now = str.substring(i, i + 1);
            if (now.equals("("))
                st.push(now);
            else if (now.equals(")")) {
                if (st.empty())
                    return "NO";
                st.pop();
            }
        }
        
        if (st.empty())
            return "YES";
        return "NO";
    }
}