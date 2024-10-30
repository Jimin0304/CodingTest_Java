class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int lenX = board[0].length;
        int lenY = board.length;
        int[][] tempBoard = new int[lenY + 2][lenX + 2];
        
        for (int y = 1; y < lenY + 1; y++) {
            for (int x = 1; x < lenX + 1; x++) {
                if (board[y - 1][x - 1] == 1) {
                    tempBoard[y-1][x-1] = tempBoard[y-1][x] = tempBoard[y-1][x+1] = tempBoard[y][x-1] = tempBoard[y][x] = tempBoard[y][x+1] = tempBoard[y+1][x-1] = tempBoard[y+1][x] = tempBoard[y+1][x+1] = -1;
                }
            }
        }
        
        for (int y = 1; y < lenY + 1; y++) {
            for (int x = 1; x < lenX + 1; x++) {
                if (tempBoard[y][x] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}