import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int c=0;c<t;c++) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int m = Integer.parseInt(br.readLine());
            int[] arr2 = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            boolean[] binary = new boolean[m];

            for(int i=0;i<m;i++){
                int start = 0;
                int end = arr.length-1;

                while(start<=end){
                    int mid = (start+end)/2;

                    if(arr2[i]>arr[mid]){
                        start = mid+1;
                    }
                    else if(arr2[i]<arr[mid]){
                        end = mid-1;
                    }
                    else{
                        binary[i] = true;
                        break;
                    }
                }
            }

            for(int i=0;i<m;i++){
                if(binary[i]){
                    sb.append(1 +"\n");
                }
                else{
                    sb.append(0 +"\n");
                }
            }
        }


        System.out.println(sb);
    }
}
