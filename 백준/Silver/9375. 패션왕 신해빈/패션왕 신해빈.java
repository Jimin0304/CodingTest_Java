import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();  // 테스트 케이스

        for (int i = 0; i < testCase; i++) {
            int m = sc.nextInt();  // 해빈이가 가진 의상의 수
            HashMap<String, List<String>> map = new HashMap<>();
        
            for (int j = 0; j < m; j++) {   // key: 의상 종류, value: 의상 이름 리스트
                String clothes = sc.next();
                String type = sc.next();
                List<String> list;
                if (map.containsKey(type)) {
                    list = map.get(type);
                }
                else {
                    list = new ArrayList<>();
                }
                list.add(clothes);
                map.put(type, list);
            }

            int result = 1;
            for (String key : map.keySet()) {
                List<String> list = map.get(key);
                result *= (list.size() + 1);   // 안입는 경우 추가
            }
            System.out.println(result - 1);    // 알몸인 경우 빼기
        }
    }
}