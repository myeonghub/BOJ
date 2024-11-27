import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n,m,A,B,C;
    static int [][] arr;
    static long [] len;
    static long INF = 2000000000;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        StringBuilder sb =new StringBuilder();

        arr = new int[m][3];
        len = new long[n+1];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());

        }

        if(bellmanford(1)){
            sb.append(-1);
        }
        else{
            for(int i=2;i<=n;i++){
                if(len[i]==INF){
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(len[i] + "\n");
                }
            }
        }

        System.out.println(sb);


    }
    public static boolean bellmanford(int start){
        Arrays.fill(len,INF);
        len[start] = 0;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                if(len[arr[j][0]] != INF){
                    len[arr[j][1]] = Math.min(len[arr[j][1]], len[arr[j][0]] + arr[j][2]);
                }
            }
        }

        boolean cycle =false;
        for(int i=0;i<m;i++){
            if(len[arr[i][0]] != INF && len[arr[i][1]] > len[arr[i][0]] +arr[i][2]){
                cycle =true;
                break;
            }
        }
        return cycle;
    }
}
