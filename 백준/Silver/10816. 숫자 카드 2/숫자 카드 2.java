import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int mid =0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        int [] arr =new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());

        int [] arr2 =new int[k];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++){
            arr2[i] = Integer.parseInt(st1.nextToken());
        }


        int []count = new int[k];

        Arrays.sort(arr);



        for(int i : arr2){
            sb.append(endFind(arr,i)-firstFind(arr,i)).append(" ");
        }

        System.out.println(sb);

    }

    public static int firstFind (int[] arr, int a){
        int start = 0;
        int end = arr.length;


        while (start < end){
            mid = (start + end) /2;

            if(arr[mid] >= a){
                end = mid;
            }
            else {
                start = mid +1;
            }
        }
        return  start;
        }
    public static int endFind (int[] arr, int a){
        int start = 0;
        int end = arr.length;


        while (start < end){
            mid = (start + end) /2;

            if(arr[mid] > a){
                end = mid;
            }
            else {
                start = mid +1;
            }
        }
        return  start;
    }

}
