import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0;
    static int k = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());


        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        quicksort(0,n-1,arr);

        if(cnt<k){
            System.out.println("-1");
        }
    }

    public static void quicksort(int start, int end , int[] arr){
        if(start<end){
            int pivot = partition(arr,start,end);
            quicksort(start,pivot-1,arr);
            quicksort(pivot+1,end,arr);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int idx = start-1;

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                idx++;
                swap(arr, idx, i);
            }
        }

        if (idx+1 != end) {
            swap(arr, idx+1, end);
        }

        return idx+1;
    }

    public static void swap(int[] arr, int a, int b) {
        int num = arr[a];
        arr[a] = arr[b];
        arr[b] = num;

        cnt++;
        if (cnt == k) {
            System.out.print(arr[a] + " " + arr[b]);
        }
    }
}
