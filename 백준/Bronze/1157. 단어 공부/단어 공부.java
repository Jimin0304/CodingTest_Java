import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str = str.toUpperCase();

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            String key = String.valueOf(str.charAt(i));
            if (map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(String.valueOf(key), 1);
        }

        String result = "";
        int count = -1;
        for (String key : map.keySet()) {
            if (map.get(key) > count) {
                result = key;
                count = map.get(key);
            }
        }
        map.remove(result);

        for (String key : map.keySet()) {
            if (map.get(key) == count) {
                System.out.println("?");
                return ;
            }
        }
        System.out.println(result);
    }
}
