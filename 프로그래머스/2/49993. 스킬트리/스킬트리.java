import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int impossible = 0;
        Stack<Character> st = new Stack<>();
        for (int i = skill.length() - 1; i >= 0; i--) {
            st.push(skill.charAt(i));
        }
        
        for (String sk : skill_trees) {
            Stack<Character> dup_stack = (Stack<Character>)st.clone();
            for (int i = 0; i < sk.length() && !dup_stack.isEmpty(); i++) {
                if (!skill.contains(sk.substring(i, i + 1)))
                    continue ;
                if (dup_stack.peek() == sk.charAt(i))
                    dup_stack.pop();
                else {
                    impossible++;
                    break ;
                }   
            }
        }
        
        return skill_trees.length - impossible;
    }
}