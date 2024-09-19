import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int k = Integer.parseInt(br.readLine());
            long sum =0;
            int[] arr = new int[k];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<k;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int max=arr[k-1];
            for(int h=k-2;h>=0;h--){
                if(max>arr[h]){
                   sum+= max - arr[h];
                }
                else {
                    max=arr[h];
                }
            }
            sb.append(sum + "\n");

        }

        System.out.println(sb);
    }
}
