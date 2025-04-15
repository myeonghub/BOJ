import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int F = 0;

        int R = 0;

        for(int i = 0; i < N; i++){
            F = Integer.parseInt(br.readLine());
            R = Integer.parseInt(br.readLine());

            System.out.println(solution(F,R));
        }

    }

    static int solution(int F, int R){
        int [][] dp = new int[F+1][R+1];


        for(int i = 0; i <= F;i++){
            for(int j = 1; j <= R; j++){
                if(i == 0){
                    dp[i][j] = j;
                }
                else if(j == 0){
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }

        return dp[F][R];

    }
}
