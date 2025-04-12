import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        boolean[] isDifferent = new boolean[str.length()];
        
        for (int i = 1; i < N; i++) {
            String now = sc.nextLine();
            for (int j = 0; j < now.length(); j++) {
                if (str.charAt(j) != now.charAt(j))
                    isDifferent[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < isDifferent.length; i++) {
            if (isDifferent[i])
                sb.append("?");
            else
                sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());
    }
}