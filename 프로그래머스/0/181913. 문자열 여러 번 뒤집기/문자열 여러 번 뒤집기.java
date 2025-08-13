class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            

            while(s < e){
                char tmp = ch[e];
                ch[e] = ch[s];
                ch[s] = tmp;
                s++;
                e--;
            }
        }
        
        for(int i = 0; i < ch.length; i++){
            answer += ch[i];
        }
        
        
        return answer;
    }
}