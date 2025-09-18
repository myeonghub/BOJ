import java.util.*;
class Solution {
    public int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(1,numbers[0] ,numbers , target);
        dfs(1, -numbers[0],  numbers, target);
        return answer;
        
    }
    public void dfs(int cnt , int sum, int[] numbers , int target){
        if(cnt ==  numbers.length && sum == target){
            answer ++;
            return;
        }
        if(cnt >=  numbers.length){
            return;
        }
        dfs(cnt + 1, sum + numbers[cnt] , numbers  , target);
        dfs(cnt + 1, sum - numbers[cnt] , numbers  , target);
    }
}