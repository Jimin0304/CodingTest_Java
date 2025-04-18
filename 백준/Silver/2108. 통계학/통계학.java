import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0 ; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (map.containsKey(arr[i])) {
                int cnt = map.get(arr[i]);
                map.put(arr[i], cnt + 1);
            }
            else
                map.put(arr[i], 1);
        }
        // 최빈값
        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> {
            int cmp = map.get(o2).compareTo(map.get(o1));
            if (cmp == 0) {
                return o1.compareTo(o2);
            }
            return cmp;
        });
        int mode = 0;
        if (keyList.size() == 1 || map.get(keyList.get(0)) > map.get(keyList.get(1)))
            mode = keyList.get(0);
        else
            mode = keyList.get(1);
        
        System.out.println(Math.round((double)sum / N));  // 산술평가
        System.out.println(arr[N / 2]);   // 중앙값
        System.out.println(mode);   // 최빈값
        System.out.println(arr[N - 1] - arr[0]);   // 범위
    }
}