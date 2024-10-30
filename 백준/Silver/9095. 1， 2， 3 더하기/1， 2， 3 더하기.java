import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        int[] arr = new int[12];
        for(int j=0;j<n;j++) {
            int k = Integer.parseInt(br.readLine());
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
            for (int i = 4; i <= k; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
            sb.append(arr[k] + "\n");
        }


        System.out.println(sb);
    }

}
