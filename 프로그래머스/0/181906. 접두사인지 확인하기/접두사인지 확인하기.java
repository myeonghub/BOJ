import java.util.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        HashSet<String> hash = new HashSet<>();
        
        for(int i = 0 ; i < my_string.length(); i++){
            hash.add(my_string.substring(0,i));
        }
        
        
        return answer = hash.contains(is_prefix) ? 1 : 0;
    }
}