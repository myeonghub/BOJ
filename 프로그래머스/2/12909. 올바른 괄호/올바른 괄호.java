import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        if(ch[0]==')'){
            return false;
        }
        for(int i = 0; i < ch.length; i++ ){
            if(ch[i] == '('){
                st.push('(');
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        
        return answer;
    }
}