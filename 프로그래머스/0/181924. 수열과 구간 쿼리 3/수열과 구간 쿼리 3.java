class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i = 0 ; i <arr.length; i++){
            answer[i] = arr[i];
        }
        
        for(int i = 0 ; i < queries.length; i++){
            answer = swap(answer,queries[i][0] , queries[i][1]);
        }
        return answer;
    }
    
    static int[] swap(int[] arr ,int i , int j){
        int tmp = 0;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        
        return arr;
    }
}