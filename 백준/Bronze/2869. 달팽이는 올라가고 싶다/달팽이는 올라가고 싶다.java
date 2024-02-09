import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String [] s = br.readLine().split(" "); 
        int A = Integer.parseInt(s[0]); 
        int B = Integer.parseInt(s[1]); 
        int V = Integer.parseInt(s[2]); 

        if (A == V)
        {
            System.out.println(1);
            return ;
        }
        
        int day = (V - A) / (A - B) + 1 ;
        if ((V - A) % (A - B) != 0)
            day += 1;
        
        System.out.println(day);
    }
}