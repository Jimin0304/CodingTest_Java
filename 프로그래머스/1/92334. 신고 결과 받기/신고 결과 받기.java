import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> cnt = new HashMap<>();
        for (String id : id_list) {
            cnt.put(id, 0);
        }
        
        // 신고 리포트 데이터 수집 및 정리
        HashMap<String, List<String>> report_map = new HashMap<>();
        for (String content : report) {
            String[] temp = content.split(" ");
            if (!report_map.containsKey(temp[0])) {
                // 신고 리포트 추가
                List<String> list = new ArrayList<>();
                list.add(temp[1]);
                report_map.put(temp[0], list);
                
                // 신고 당한 유저의 신고 당한 횟수 업데이트
                int val = cnt.get(temp[1]);
                cnt.put(temp[1], val + 1);
            }
            else {
                List<String> list = report_map.get(temp[0]);
                if (!list.contains(temp[1])) { // 중복 아닐 때만
                    list.add(temp[1]);
                    report_map.put(temp[0], list);
                    
                    // 신고 당한 유저의 신고 당한 횟수 업데이트
                    int val = cnt.get(temp[1]);
                    cnt.put(temp[1], val + 1);
                }
            }
        }
        
        // k번 이상 신고당한 유저
        List<String> users = new ArrayList<>();
        for (String user : cnt.keySet()) {
            System.out.println(user + " " + cnt.get(user));
            if (cnt.get(user) >= k)
                users.add(user);
        }

        // 정리한 거 기반으로 체크
        int index = 0;
        for (String id : id_list) {
            if (report_map.containsKey(id)) {
                List<String> tmp = report_map.get(id);
                for (String name : tmp) {
                    if (users.contains(name))
                        answer[index]++;
                }
            }
            index++;
        }
        
        return answer;
    }
}