import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();


        int[][] arr = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] +arr[i][j];
            }
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int s1 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            int e1 = Integer.parseInt(st.nextToken());
            int e2 = Integer.parseInt(st.nextToken());
            sb.append((sum[e1][e2] - sum[s1-1][e2] - sum[e1][s2-1] + sum[s1-1][s2-1]) + "\n");
        }


        System.out.println(sb);
    }
}
