import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        int extIndex = map.get(ext);
        int sortIndex = map.get(sort_by);
        
        for (int[] d : data) {
            if (d[extIndex] < val_ext) {
                list.add(d);
            }
        }
        
        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer, (o1, o2) -> {
           return o1[sortIndex] - o2[sortIndex];
        });
        
        return answer;
    }
}