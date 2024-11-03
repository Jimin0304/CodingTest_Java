import java.util.*;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        if (!s.contains(",")) {
            String num = s.substring(2, s.length() - 2);
            return new int[]{Integer.parseInt(num)};
        }
        
        String[] arr = s.split("\\},\\{");
        arr[0] = arr[0].substring(2);
        arr[arr.length - 1] = arr[arr.length - 1].substring(0, arr[arr.length - 1].length() - 2);
        
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            String[] array = arr[i].split(",");
            for (int j = 0; j < array.length; j++) {
                row.add(Integer.parseInt(array[j]));
            }
            list.add(row);
        }
        
        int number = 1;
        while (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).size() == number) {
                    for (int num : list.get(i)) {
                        if (!answer.contains(num))
                            answer.add(num);
                    }
                    number++;
                    list.remove(i);
                }
            }
        }

        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}