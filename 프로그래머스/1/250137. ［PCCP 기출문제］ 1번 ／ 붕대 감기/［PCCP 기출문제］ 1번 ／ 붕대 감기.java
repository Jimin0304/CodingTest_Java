class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int index = 0;
        int time = 1;
        int relay = 0;
        int max_health = health;
        
        while (time <= attacks[attacks.length - 1][0]) {
            if (time == attacks[index][0]) {    // attack
                health -= attacks[index++][1]; 
                // died
                if (health <= 0)
                    return -1;
                relay = 0;
                
                time++;
                continue ;
            }
            
            health += bandage[1];
            relay++;
            
            if (relay == bandage[0]) {  // additional recovery
                health += bandage[2];
                relay = 0;
            }
            
            if (health > max_health)
                health = max_health;
            
            time++;
        }
        
        return health;
    }
}