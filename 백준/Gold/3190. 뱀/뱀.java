import java.util.*;

public class Main {
    public enum DIRECTION {LEFT, RIGHT, UP, DOWN};
    public static class Node {
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static DIRECTION changeDirect(DIRECTION now, char degree) {
        DIRECTION result = now;
        if (now == DIRECTION.LEFT) {
            if (degree == 'L')
                result = DIRECTION.DOWN;
            else
                result = DIRECTION.UP;
        }
        else if (now == DIRECTION.RIGHT) {
            if (degree == 'L')
                result = DIRECTION.UP;
            else
                result = DIRECTION.DOWN;
        }
        if (now == DIRECTION.UP) {
            if (degree == 'L')
                result = DIRECTION.LEFT;
            else
                result = DIRECTION.RIGHT;
        }
        if (now == DIRECTION.DOWN) {
            if (degree == 'L')
                result = DIRECTION.RIGHT;
            else
                result = DIRECTION.LEFT;
        }
        return  result;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] board = new int[N][N];    // 1이면 자기 몸, 2면 사과
        while (K-- > 0) {
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            board[row][col] = 2;
        }
        int L = sc.nextInt() - 1;
        int changeTiming = sc.nextInt();
        char nextDirect = sc.next().charAt(0);
        int x = 0;
        int y = 0;
        int time = 0;
        DIRECTION direction = DIRECTION.RIGHT;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));
        while (time <= 10000) {
            time++;
            switch(direction) {
                case LEFT:
                    --x;
                    if (x < 0 || board[y][x] == 1) {
                        System.out.println(time);
                        return ;
                    } 
                    if (board[y][x] == 2) {
                        q.offer(new Node(x, y));
                        board[y][x] = 1;
                    }
                    else {
                        q.offer(new Node(x, y));
                        board[y][x] = 1;
                        Node node = q.poll();
                        board[node.y][node.x] = 0;
                    }
                    break ;
                 case RIGHT:
                    ++x;
                    if (x >= N || board[y][x] == 1) {
                        System.out.println(time);
                        return ;
                    }
                    if (board[y][x] == 2) {
                        q.offer(new Node(x, y));
                        board[y][x] = 1;
                    }
                    else {
                        q.offer(new Node(x, y));
                        board[y][x] = 1;
                        Node node = q.poll();
                        board[node.y][node.x] = 0;
                    }
                    break ;
                 case UP:
                    --y;
                    if (y < 0 || board[y][x] == 1) {
                        System.out.println(time);
                        return ;
                    }
                    if (board[y][x] == 2) {
                        q.offer(new Node(x, y));
                        board[y][x] = 1;
                    }
                    else {
                        q.offer(new Node(x, y));
                        board[y][x] = 1;
                        Node node = q.poll();
                        board[node.y][node.x] = 0;
                    }
                    break ;
                 case DOWN:
                    ++y;
                    if (y >= N || board[y][x] == 1) {
                        System.out.println(time);
                        return ;
                    }
                    if (board[y][x] == 2) {
                        q.offer(new Node(x, y));
                        board[y][x] = 1;
                    }
                    else {
                        q.offer(new Node(x, y));
                        board[y][x] = 1;
                        Node node = q.poll();
                        board[node.y][node.x] = 0;
                    }
                    break ;
            }
            if (changeTiming == time) {
                direction = changeDirect(direction, nextDirect);
                if (L-- > 0) {
                    changeTiming = sc.nextInt();
                    nextDirect = sc.next().charAt(0);
                }
            }
        }
        System.out.println(time);
    }  
}