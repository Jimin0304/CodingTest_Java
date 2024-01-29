import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int takenTime = sc.nextInt();
        
        int takenHour = takenTime / 60;
        int takenMinute = takenTime % 60 + minute;
        
        if (takenMinute >= 60) {
            takenHour += takenMinute / 60;
            takenMinute = takenMinute % 60;
        }
        
        System.out.printf("%d %d", (hour + takenHour) % 24, takenMinute);
    }
}