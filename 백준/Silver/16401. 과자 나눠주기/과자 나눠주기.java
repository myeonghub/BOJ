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

        arr = new int[m];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);
        max = arr[m-1];
        int a = binarysearch(1,max);
        System.out.println(a);
    }

    public static int binarysearch(int start ,int end ) {
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int count = gwaja(mid);

            if (count < n) {
                end = mid - 1;

            } else {
                result = mid;
                start = mid + 1;
            }

        }
        return result;
    }

    public static int gwaja(int mid){
        int count =0;
        for(int i =0;i<m;i++) {

                count += arr[i]/mid;
            }
        return count;
    }

}
