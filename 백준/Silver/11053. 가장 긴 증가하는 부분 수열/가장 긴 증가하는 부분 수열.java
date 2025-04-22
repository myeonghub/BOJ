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

        System.out.println(solution(arr,N)+1);

    }

    static int solution(int[] arr, int N){

        int cnt = 0;

        int[] dp = new int[N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                cnt = Math.max(cnt,dp[i]);
            }
        }

        return cnt;
    }
}
