import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        int sum =0;
        int tmp =0;
        for(int i =0;i<n-2;i++){
            for(int j =i;j<n-1;j++){
                for(int k =j;k<n;k++){
                    if(i!=j && i!=k && j!=k) {
                        tmp = arr[i] + arr[j] + arr[k];
                    }
                    if(tmp<= m && tmp>sum){
                        sum =tmp;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
