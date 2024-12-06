import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        
        for (String call : callings) {
            if (map.containsKey(call)) {
                int now_rank = map.get(call);
                String front_player = players[now_rank - 1];
                players[now_rank] = front_player;
                players[now_rank - 1] = call;
                map.put(front_player, now_rank);
                map.put(call, now_rank - 1);
            }
        }
        
        return players;
    }
}