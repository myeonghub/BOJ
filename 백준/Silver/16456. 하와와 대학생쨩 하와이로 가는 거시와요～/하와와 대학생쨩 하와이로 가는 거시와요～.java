import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        System.out.println(solution(N));
    }

    static Long solution(int N){
        Long[] dp = new Long[N+1];
        dp[1] = 1l;
        if(N >= 2){
            dp[2] = 1l;
        }
        if(N >= 3){
            dp[3] = 2l;
        }
        for(int i = 4; i <= N; i++){
            dp[i] = (dp[i-1] + dp[i-3])%1000000009;
        }

        return dp[N];
    }
}
