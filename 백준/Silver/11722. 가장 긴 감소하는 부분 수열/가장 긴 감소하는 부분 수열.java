import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N,arr)+1);
    }

    static int solution(int N, int[] arr){
        int[] dp = new int[N];

        int cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] < arr[j]){
                    dp[i] = Math.max(dp[j] +1 , dp[i]);
                }
            }
            cnt = Math.max(cnt,dp[i]);
        }

        return cnt;
    }
}

