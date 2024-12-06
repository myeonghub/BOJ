import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[n];
        boolean [] check = new boolean[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int j=0;j<n;j++) {
            check[j] = false;
            if(arr[j]==1){
                check[j] = true;
            }
            for (int i = 2; i <= Math.sqrt(arr[j]); i++) {
                if (arr[j] % i == 0 ) {
                    check[j] = true;
                }
            }
        }
        int cnt =0;
        for(int i=0;i<n;i++){
            if(!check[i]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
