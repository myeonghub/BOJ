import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][3];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = arr[i][1] - arr[i][0];
            if(arr[i][0] > arr[i][1]){
                System.out.println(-1);
                return;
            }
        }


        Arrays.sort(arr, (o1,o2) -> o1[1] - o2[1]);

        int start = arr[0][2];

        while(true) {
            boolean chk = true;
            int time = start + arr[0][0];
            for (int i = 1; i < n; i++) {
                time = time + arr[i][0];
                if (arr[i][1] < time) {
                    start -= time - arr[i][1];
                    if(start<0){
                        System.out.println(-1);
                        return;
                    }
                    chk = false;
                    break;
                }
            }
            if(chk){
                break;
            }
        }

        System.out.println(start);

    }
}
