class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String neq = ineq+eq;
        if(neq.equals(">=")){
            answer = n>=m ? 1 : 0;
        }
        else if(neq.equals("<=")){
            answer = n<=m ? 1 : 0;
        }
        else if(neq.equals(">!")){
            answer = n>m ? 1 : 0;
        }
        else if(neq.equals("<!")){
            answer = n<m ? 1 : 0;
        }
        return answer;
    }
}