import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int sum = 0;
        int left =0 ,right =0;
        while(right<n){
            if(sum + arr[right]<=m){
                sum += arr[right];
                max = Integer.max(max, sum);
                right +=1;
            }
            else{
                sum -= arr[left];
                left+=1;
            }


        }

        System.out.println(max);

    }
}
