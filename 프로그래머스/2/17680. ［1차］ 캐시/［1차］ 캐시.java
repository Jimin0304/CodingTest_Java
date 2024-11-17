class Solution {
    
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0)
            return cities.length * 5;
        
        int answer = 0;
        String[] cache = new String[cacheSize];
        int[] time = new int[cacheSize];
        for (int i = 0; i < cacheSize; i++) {
            cache[i] = "";
        }

        
        for (String city : cities) {
            boolean check = false;
            for (int i = 0; i < cacheSize; i++) {
                if (cache[i].isEmpty()) {
                    cache[i] = city.toUpperCase();
                    answer += 5;
                    check = true;
                    break ;
                }
                else if (cache[i].equals(city.toUpperCase())) {
                    answer++;
                    time[i] = 0;
                    check = true;
                    for (int j = i + 1; j < cacheSize; j++) {
                        time[j]++;
                    }
                    break ;
                }
                else {
                    time[i]++;
                }
            }
            if (!check) {
                int max = 0;
                int index = 0;
                for (int j = 0; j < cacheSize; j++) {
                    if (max < time[j]) {
                        index = j;
                        max = time[j];
                    }
                }
                answer += 5;
                cache[index] = city.toUpperCase();
                time[index] = 0;
            }
        }
        
        return answer;
    }
}