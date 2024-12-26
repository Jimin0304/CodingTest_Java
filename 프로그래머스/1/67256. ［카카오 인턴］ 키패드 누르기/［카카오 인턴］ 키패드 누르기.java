class Solution {
    public static int[][] keyPad = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
    
    public int findIndex(int row, int number) {
        for (int i = 0; i < 4; i++) {
            if (number == keyPad[i][row])
                return i;
        }
        return -1;
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] left = new int[] {3, 0};
        int[] right = new int[] {3, 2};
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                int index = findIndex(0, numbers[i]);
                left[0] = index;
                left[1] = 0;
                answer += "L";
            }
            else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                int index = findIndex(2, numbers[i]);
                right[0] = index;
                right[1] = 2;
                answer += "R";
            }
            else {
                int index = findIndex(1, numbers[i]);
                int leftDistance = Math.abs(left[0] - index) + Math.abs(left[1] - 1);
                int rightDistance = Math.abs(right[0] - index) + Math.abs(right[1] - 1);
                if (leftDistance < rightDistance || (leftDistance == rightDistance) && hand.equals("left")) {
                    left[0] = index;
                    left[1] = 1;
                    answer += "L";
                }
                else if (leftDistance > rightDistance || (leftDistance == rightDistance) && hand.equals("right")) {
                    right[0] = index;
                    right[1] = 1;
                    answer += "R";
                }
            }
        }
        
        return answer;
    }
}