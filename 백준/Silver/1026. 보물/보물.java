import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer [] arr = new Integer[n];
        Integer [] arr2 = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr2[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);
        Arrays.sort(arr2,Collections.reverseOrder());

        int sum =0;
        for(int i=0;i<n;i++){
            sum+=(arr[i] * arr2[i]);
        }

        System.out.println(sum);
    }
}
