class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (min > num)
                min = num;
            else if (max < num)
                max = num;
        }
    
        answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}