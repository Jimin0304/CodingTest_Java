import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 8; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 8; j++) {
                char ch = line.charAt(j);
                if (ch == 'F' && (i + j) % 2 == 0)
                    result++;
            }
        }
        System.out.println(result);
    }
}