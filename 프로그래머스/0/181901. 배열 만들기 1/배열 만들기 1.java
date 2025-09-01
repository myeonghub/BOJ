class Solution {
    public int[] solution(int n, int k) {
        int cnt = n/k;
        int[] answer = new int[cnt];
        int a = 0;
        for(int i = 0; i < cnt; i++){
            a = a + k;
            answer[i] = a;
        }
        return answer;
    }
}