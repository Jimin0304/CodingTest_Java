class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        String[] arr = polynomial.split(" ");
        int x = 0;
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+"))
                continue ;
            if (arr[i].contains("x")) {
                if (arr[i].length() == 1)
                    x += 1;
                else
                    x += Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
            }
            else {
                num += Integer.parseInt(arr[i]);
            }
        }
        
        if (x == 1)
            answer.append("x");
        else if (x > 1) {
            answer.append(String.valueOf(x));
            answer.append("x");
        }
        
        if (answer.length() != 0 && num > 0) {
            answer.append(" + ");
            answer.append(String.valueOf(num));
        }
        else if (num > 0)
            answer.append(String.valueOf(num));
        
        return answer.toString();
    }
}