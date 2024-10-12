import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
           arr[i] = Integer.parseInt(st1.nextToken());
        }
        
        Arrays.sort(arr);
        
     
        System.out.println(arr[n-k]);
    }

}
