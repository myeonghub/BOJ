import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb =new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++){
            int a = Integer.parseInt(st1.nextToken());
            if(Arrays.binarySearch(arr,a) >=0){
                sb.append(1).append(" ");
            }
            else {
                sb.append(0).append(" ");
            }
        }


        System.out.println(sb);
    }
}
