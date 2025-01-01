import java.util.HashMap;

class Solution {
//     public class User {
//         String userId;
//         String nickname;
        
//         public User(String userId, String nickname) {
//             this.userId = userId;
//             this.nickname = nickname;
//         }
        
//         public String getNickName() {
//             return this.nickname;
//         }
//     }
    
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int len = 0;
        
        // 사용자, 닉네임 저장
        for (String str : record) {
            String[] tmp = str.split(" ");
            if (tmp[0].equals("Enter")) {
                map.put(tmp[1], tmp[2]);
                len++;
            }
            else if (tmp[0].equals("Change"))
                map.put(tmp[1], tmp[2]);
            else len++;
        }
        
        // 결과
        String[] answer = new String[len];
        int index = 0;
        for (String str : record) {
            String[] tmp = str.split(" ");
            String nickname = map.get(tmp[1]);
            if (tmp[0].equals("Enter")) {
                answer[index] = nickname + "님이 들어왔습니다.";
                index++;
            }
            else if (tmp[0].equals("Leave")) {
                answer[index] = nickname + "님이 나갔습니다.";
                index++;
            }
        }
        
        return answer;
    }
}