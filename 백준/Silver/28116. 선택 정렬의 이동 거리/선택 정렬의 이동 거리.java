import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] arr2 = new int[n+1];
        int[] Lenth = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<n+1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[arr[i]] = i;
        }

        int tmp =0;

        for(int j =1;j<n+1;j++){
            if(arr[j] !=j) {
                int k = arr2[j];

                Lenth[j] += Math.abs(j - k);
                Lenth[arr[j]] += Math.abs(j - k);

                tmp = arr[j];
                arr[j] = j;
                arr[k] = tmp;

                arr2[tmp] = k;
                arr2[j] = j;
            }

        }

        StringBuffer sb = new StringBuffer();
        for(int i =1;i<n+1;i++){
            sb.append(Lenth[i]+" ");
        }
        System.out.println(sb);
    }
}
