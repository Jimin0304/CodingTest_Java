import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long Z;
        if (X == 0)
            Z = 0;
        else
            Z = ((Y * 100) / X);
        
        if (Z >= 99) {
            System.out.println(-1);
            return;
        }

        long newZ = Z + 1;
        if ((((X * newZ) - (100 * Y)) % (100 - newZ)) == 0)
            System.out.println((((X * newZ) - (100 * Y)) / (100 - newZ)));
        else
            System.out.println((((X * newZ) - (100 * Y)) / (100 - newZ)) + 1);
    }
}

// ((Y + result) / (X + result)) * 100 = ++Z;
// (100X + 100result) = XZ + Zresult;
// (100 - Z) * result = XZ - 100X;
// result = (XZ - 100X) / (100 - Z)