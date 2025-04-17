import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int start = Integer.parseInt(num);
        int result = 0;
        
        do {
            result++;
            if (num.length() == 1) {
                num = '0' + num;
            }
            int newNum = Integer.parseInt(num.substring(0, 1)) + Integer.parseInt(num.substring(1, 2));
            num = num.substring(1, 2) + String.valueOf(newNum % 10);
        } while (start != Integer.parseInt(num));

        System.out.println(result);
    }
}