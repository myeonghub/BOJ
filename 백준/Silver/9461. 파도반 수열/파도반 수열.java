import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        Long [] arr = new Long[101];
        arr[0] =1l;
        arr[1] =1l;
        arr[2] =1l;
        arr[3] =2l;
        arr[4] =2l;
        for(int i=0;i<n;i++){
            int k = Integer.parseInt(br.readLine());
            if(k>=5) {
                for (int j = 5; j <= k; j++) {
                    arr[j] = arr[j - 1] + arr[j - 5];
                }
            }

            sb.append(arr[k-1]+"\n");
        }

        System.out.println(sb);
    }
}
