class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int minVal = 0;
        int maxVal = 1000;
        int[] answer = new int[2];
        int answer1 = 0;
        int answer2 = 0;
        
        boolean check = (minVal < numer1) && (numer1 < maxVal) &&
            (minVal < denom1) && (denom1 < maxVal) &&
            (minVal < numer2) && (numer2 < maxVal) &&
            (minVal < denom2) && (denom2 < maxVal);
        
        if (denom1 == denom2) {
            answer1 = numer1 + numer2;
            answer2 = denom1;
        }
        else if (denom1 > denom2) {
            if ((denom1 % denom2) == 0) {
                answer1 = numer1 + (numer2 * (denom1 / denom2));
                answer2 = denom1;
            }
            else {
                answer1 = (numer1 * denom2) + (numer2 * denom1);
                answer2 = denom1 * denom2;
            }
        }
        else {
            if ((denom2 % denom1) == 0) {
                answer1 = (numer1 * (denom2 / denom1)) + numer2;
                answer2 = denom2;
            }
            else {
                answer1 = (numer1 * denom2) + (numer2 * denom1);
                answer2 = denom2 * denom1;
            }
        }
        
        int i = 0;
        int smlNum = Math.min(answer1, answer2);
        for (i = smlNum; i >= 1; i--) {     // 최대공약수
            if (answer1 % i == 0 && answer2 % i == 0)
                break ;
        }
        
        if (i == 1) {
            answer[0] = answer1;
            answer[1] = answer2;
        }
        else {
            answer[0] = answer1 / i;
            answer[1] = answer2 / i;
        }
        
        return answer;
    }
}