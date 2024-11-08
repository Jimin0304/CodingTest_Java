class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;

        // 처음 쪽 기지국
        if (stations[0] - w > 1) {
            if ((stations[0] - w - 1) % (2 * w + 1) != 0)
                answer += (stations[0] - w - 1) / (2 * w + 1) + 1;
            else
                answer += (stations[0] - w - 1) / (2 * w + 1);
        }
        // 중간 기지국
        for (int i = 1; i < stations.length; i++) {
            int middle = (stations[i] - w) - (stations[i - 1] + w) - 1;
            if (middle > 0) {
                if (middle % (2 * w + 1) != 0)
                    answer += middle / (2 * w + 1) + 1;
                else
                    answer += middle / (2 * w + 1);
            }
        }
        // 끝 쪽 기지국
        if (n - (stations[stations.length - 1] + w) > 0) {
            if ((n - (stations[stations.length - 1] + w)) % (2 * w + 1) != 0)
                answer += ((n - (stations[stations.length - 1] + w)) / (2 * w + 1)) + 1;
            else
                answer += ((n - (stations[stations.length - 1] + w)) / (2 * w + 1));
        }

        return answer;
    }
}