import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j = 0; j < M; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        int result = -1;
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < M; ++j)
                for (int mi = -N; mi < N; ++mi)
                    for (int mj = -M; mj < M; ++mj)
                    {
                        if (mi == 0 && mj == 0) { 
                            continue;
                        }

                        int t = 0;
                        int ni = i;
                        int nj = j;
                        while (ni >= 0 && ni < N && nj >= 0 && nj < M)
                        {
                            t = 10 * t + arr[ni][nj]; 
                            if (Math.sqrt(t)== (int)Math.sqrt(t)){ 
                                result = Math.max(result, t);
                            }
                            ni += mi;
                            nj += mj;
                        }

                    }
        System.out.println(result);

    }
}
