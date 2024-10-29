import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());



        Long [] arr = new Long[n];
        for(int i =0;i<n;i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);

        Long end = arr[n-1] ;
        Long start =  1l;
        Long result =  0l;
        while(start<=end) {
            Long mid = (end+start)/2;
            int sum =0;
            for (int i = 0; i < n; i++) {
                sum += arr[i]/mid;
            }
            if(sum>=k){
                result = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        System.out.println(result);
    }
}
