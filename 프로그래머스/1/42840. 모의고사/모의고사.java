import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        int j = 0;
        for(int i = 0 ; i < answers.length; i++){
            if(j == one.length){
                j = 0;
            }
            if(answers[i] == one[j]){
                cnt1++;
            }
            j++;
        }
        j = 0;
        for(int i = 0 ; i < answers.length; i++){
            if(j == two.length ){
                j = 0;
            }
            if(answers[i] == two[j]){
                cnt2++;
            }
            j++;
        }
        j = 0;
        for(int i = 0 ; i < answers.length; i++){
            if(j == three.length){
                j = 0;
            }
            if(answers[i] == three[j]){
                cnt3++;
            }
            j++;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(cnt1,1);
        map.put(cnt2,2);
        map.put(cnt3,3);

        answer[0] = cnt1;
        answer[1] = cnt2;
        answer[2] = cnt3;

        Arrays.sort(answer);
        
        
        if(answer[2] > answer[1] ){
            int[] arr = new int[1];
            arr[0] = map.get(answer[2]);
            return arr;
        }
        else if(answer[2] == answer[1] && answer[1] > answer[0]){
            int[] arr = new int[2];
            int tmp = map.get(answer[0]);
            if(tmp == 1){
                arr[0] = 2;
                arr[1] = 3;
            }
            if(tmp == 2){
                arr[0] = 1;
                arr[1] = 3;
            }
            if(tmp == 3){
                arr[0] = 1;
                arr[1] = 2;
            }
            Arrays.sort(arr);
            return arr;
        }
        else if(answer[2] == answer[1] && answer[1] == answer[0]){
            int[] arr = {1,2,3};
        
            return arr;
        }
        return answer;
    }
}