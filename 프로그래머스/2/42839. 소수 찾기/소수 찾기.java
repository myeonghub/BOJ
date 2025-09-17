import java.util.*;
class Solution {
    public HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        char[] ch = numbers.toCharArray();
        boolean[] chk = new boolean[ch.length];
        
        dfs("" , ch , chk);
        for(int k : set){
            if(prime(k)){
                answer++;
            }
        }
        
        return answer;
    }
    public void dfs(String str , char[] ch , boolean[] chk){
        if(!str.isEmpty()){
            set.add(Integer.parseInt(str));
        }
        
        for(int i = 0; i < ch.length; i++){
            if(!chk[i]){
                chk[i] = true;
                dfs(str + ch[i], ch , chk);
                chk[i] = false;
            }
        }
    }
    
    public boolean prime(int k){
        if(k <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(k); i++){
            if(k % i == 0){
                return false;
            }
        }
        return true;
    }
}