import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int c=0;c<n;c++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] A = new int[a];
            int[] B = new int[b];

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<a;i++){
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<b;i++){
                B[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(B);
            int sum =0;


            for(int i=0;i<a;i++){
                int start = 0;
                int end = B.length-1;
                int tmp = 0;

                while(start  <= end){
                    int mid = (start+end)/2;
                    if(B[mid]<A[i]){
                        start = mid+1;
                        tmp = mid +1;
                    }
                    else {
                        end = mid-1;
                    }
                }
                sum+=tmp;
            }
            sb.append(sum + "\n");
        }


        System.out.print(sb);
    }
}
