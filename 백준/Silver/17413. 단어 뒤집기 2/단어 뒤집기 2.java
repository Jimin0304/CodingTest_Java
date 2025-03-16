import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (now == '<') {
                if (start < i) {
                    tmp.append(str.substring(start, i));
                    sb.append(tmp.reverse().toString());
                    tmp.setLength(0);
                }
                while (str.charAt(i) != '>') {
                    sb.append(str.charAt(i++));
                }
                sb.append(">");
                start = i + 1;
            }
            else if (now == ' ') {
                tmp.append(str.substring(start, i));
                sb.append(tmp.reverse().toString()).append(" ");
                tmp.setLength(0);
                start = i + 1;
            }
        }
        tmp.append(str.substring(start, str.length()));
        sb.append(tmp.reverse().toString());
        System.out.println(sb.toString());
    }
}