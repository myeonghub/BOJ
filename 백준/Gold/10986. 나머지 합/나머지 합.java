import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long ans = 0;

        long [] sum = new long[n];
        long [] res = new long[m];


        StringTokenizer st1 = new StringTokenizer(br.readLine());

        sum[0] = (Long) Long.parseLong(st1.nextToken());
        for(int i=1;i<n;i++){
            sum[i] = sum[i-1]+ Integer.parseInt(st1.nextToken());
        }

        for(int i=0;i<n;i++){
            int remainder = (int) (sum[i]%m);

            if(remainder == 0){
                ans ++;
            }
            res[remainder] +=1;
        }

        for(int i=0;i<m;i++){
            if(res[i]>1){
                ans = ans + (res[i] * (res[i]-1)/2);
            }
        }

        System.out.println(ans);


    }
}
