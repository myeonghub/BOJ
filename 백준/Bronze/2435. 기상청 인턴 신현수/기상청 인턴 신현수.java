import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int [N+1];


        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int Max = Integer.MIN_VALUE;
        for(int i = 0; i <= N - M; i++){
            int sum = 0;
            for(int j = 0; j < M; j++){
                sum = sum + arr[i+j];
            }
            if(sum > Max){
                Max = sum;
            }
        }



        System.out.println(Max);

    }
}
