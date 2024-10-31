import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());

        }

        dp[1] =1;
        for(int i=2;i<=n;i++){
            dp[i] =1;
            for(int j=0;j<i;j++) {
                if(arr[i]<arr[j] && dp[i]<=dp[j]){
                    dp[i] = dp[j]+1;
                }else if(dp[i]==dp[j]){
                    dp[i] = dp[j];
                }
            }
        }
        int max =0;
        for(int i=1;i<=n;i++){
            max = Math.max(dp[i],max);
        }

        System.out.println(max);



    }
}
