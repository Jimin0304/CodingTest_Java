import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int impossible = 0;
        List<Character> skill_list = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < skill.length(); i++) {
            skill_list.add(skill.charAt(i));
            st.push(skill.charAt(skill.length() - 1 - i));
        }
        
        for (String sk : skill_trees) {
            Stack<Character> dup_stack = (Stack<Character>)st.clone();
            for (int i = 0; i < sk.length() && !dup_stack.isEmpty(); i++) {
                if (!skill_list.contains(sk.charAt(i)))
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