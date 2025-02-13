import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[26];
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            cnt[Character.toUpperCase(str.charAt(i)) - 'A']++;
        }

        int[] copy = cnt.clone();
        Arrays.sort(copy);
        if (copy[25] == copy[24])
            System.out.println("?");
        else {
            for (int i = 0; i < cnt.length; i++) {
                if (cnt[i] == copy[25]) {
                    System.out.println((char)('A' + i));
                    break ;
                }
            }
        }
    }
}