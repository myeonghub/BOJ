import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int n;
    static int m;
    static int cnt;

    static int paint;
    static int area;



    static int[] X = {0,0,-1,1};
    static int[] Y = {1,-1,0,0};


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        
        
        long[] dp = new long[1001];


        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < n + 1; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] = dp[i] % 10007;
        }

        System.out.println(dp[n]);



    }
}

