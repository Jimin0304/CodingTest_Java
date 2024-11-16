import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 1; i <= n; i += 2) {
            if ((i == a && i + 1 == b) || (i == b && i + 1 == a))
                return answer;
            if ((i == a) || (i == b))
                dq.addLast(i);
            else if ((i + 1 == a) || (i + 1 == b))
                dq.addLast(i + 1);
            else
                dq.addLast(i);
        }

        while (n > 1) {
            answer++;
            n /= 2;
            for (int i = 0; i < n; i += 2) {
                int first = dq.pollFirst();
                int second = dq.pollFirst();
                if ((first == a && second == b) || (first == b && second == a))
                    return answer;
                if ((first == a) || (first == b))
                    dq.addLast(first);
                else if ((second == a) || (second == b))
                    dq.addLast(second);
                else
                    dq.addLast(first);
            }
        }

        return answer;
    }
}