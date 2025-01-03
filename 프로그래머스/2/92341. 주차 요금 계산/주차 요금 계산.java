import java.util.*;

class Solution {
    public class Record {
        int enterTime;
        int totalTime;
        
        public Record(int enterTime) {
            this.enterTime = enterTime;
            this.totalTime = 0;
        }
        
        public Record(int enterTime, int totalTime) {
            this.enterTime = enterTime;
            this.totalTime = totalTime;
        }
        
        public int getTotalTime() {
            return this.totalTime;
        }
        
        public int getEnterTime() {
            return this.enterTime;
        }
        
        public void setTotalTime(int time) {
            this.totalTime += time;
        }
        
        public void setEnterTime(int time) {
            this.enterTime = time;
        }
    }
    
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Record> map = new HashMap<>();
        
        for (String record : records) {
            String[] tmp = record.split(" ");
            String[] strTime = tmp[0].split(":");
            int time = Integer.parseInt(strTime[0]) * 60 + Integer.parseInt(strTime[1]);
            if (!map.containsKey(tmp[1])) {
                map.put(tmp[1], new Record(time));
            }
            else {
                Record now = map.get(tmp[1]);
                if (tmp[2].equals("OUT")) {
                    now.setTotalTime(time - now.getEnterTime());
                    now.setEnterTime(-1);
                }
                else    // IN 일 때
                    now.setEnterTime(time);
            }
        }
        
        List<String> keySet = new ArrayList<>(map.keySet());
        // 키 값으로 오름차순 정렬
        Collections.sort(keySet);
        int[] answer = new int[map.size()];
        int index = 0;
        for (String key : keySet) {
            Record now = map.get(key);
            int totalTime = now.getTotalTime();
            if (now.getEnterTime() > -1)    // OUT이 따로 명시되지 않았을 때
                totalTime += (23 * 60 + 59) - now.getEnterTime();
            int totalCost = fees[1];
            if (totalTime > fees[0])
                totalCost += Math.ceil((double)(totalTime - fees[0]) / (double)fees[2]) * fees[3];
            answer[index++] = totalCost;
        }
        
        return answer;
    }
}