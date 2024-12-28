import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        int[] arr =new int[n+1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int start =0;
        int end =0;
        int cnt =0;
        long sum =0;
        while(true){
            if(sum>=m){
                sum-=arr[start];
                start++;
            }
            else{
                sum+=arr[end];
                end++;
            }
            if(sum==m){
                cnt++;
            }
            if(start > n || end > n){
                break;
            }
        }

        System.out.println(cnt);
    }
}
