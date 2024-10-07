import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n,m , max   ;
    static int[] arr;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int sum =0;
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
            }
        }


        int a = binarysearch(max,sum);
        System.out.println(a);
    }

    public static int binarysearch(int start ,int end ) {
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int count = inchul(mid);

            if (count > m) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }

    public static int inchul(int mid){
        int k = mid;
        int count = 1;

        for(int i =0;i<n;i++){
            if(mid<arr[i]){
                return m+1;
            }
            if(k>=arr[i]){
                k -=arr[i];
            }
            else{
                k = mid - arr[i] ;
                count++;
            }
        }
        return count;
    }

}
