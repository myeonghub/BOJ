import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
    
        for(int i = l ; i <= r ; i++){
            String s = i + "";
            boolean flag = true;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) != '5' && s.charAt(j) != '0'){
                    flag = false;
                }
            }
            if(flag){
                    answer.add(Integer.parseInt(s));
                }
        }
        if(answer.size() == 0){
            answer.add(-1);
            return answer;
        }
        return answer;
        
    }
}