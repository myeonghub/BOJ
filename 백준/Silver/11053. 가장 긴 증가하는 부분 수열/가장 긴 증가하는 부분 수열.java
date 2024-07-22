import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] dp = new int [n];
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i]=1;
        }
        int max=1;
        for (int j =0 ; j<n ; j++){
            for(int k=0; k<j;k++){
                if(arr[j]>arr[k]){
                    dp[j]=Math.max(dp[j],dp[k]+1);
                }
            }
            max = Math.max(max,dp[j]);
        }

        System.out.println(max);


    }

}
