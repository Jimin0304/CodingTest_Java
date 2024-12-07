import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> terms_map = new HashMap<>();
        for (String term : terms) {
            String[] res = term.split(" ");
            terms_map.put(res[0], Integer.parseInt(res[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] res = privacies[i].split(" ");
            int add_month = terms_map.get(res[1]);
            int month = Integer.parseInt(res[0].substring(5, 7)) + add_month;
            int day = Integer.parseInt(res[0].substring(8));
            int year = Integer.parseInt(res[0].substring(0, 4));
            if(month > 12) {
                year += month / 12;
                month = month % 12;
            } 
            if(month == 0) {
                year--;
                month = 12;
            }
            
            // // 파기할 필요 없을 때 continue ;
            if (Integer.parseInt(today.substring(0, 4)) < year)
                continue ;
            if (Integer.parseInt(today.substring(0, 4)) == year) {
                if (Integer.parseInt(today.substring(5, 7)) < month)
                    continue ;
                if (Integer.parseInt(today.substring(5, 7)) == month && Integer.parseInt(today.substring(8)) < day)
                    continue ;
            }
            
            answer.add(i + 1);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}