import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = my_string.substring(s,e + 1);
        
        char[] ch = str.toCharArray();
        String rev = "";
        for(int i = ch.length - 1 ; i >= 0; i--){
            rev += ch[i];
        }
        
        answer = my_string.replace(str,rev);
        
        return answer;
    }
}