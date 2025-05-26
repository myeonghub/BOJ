import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int cnt = 0;

        int b = N - 1;
        int a = 0;
            while(a < b){
                    if(arr[a] + arr[b] > X){
                        b--;
                    }
                    else if(arr[a] + arr[b] < X){
                        a++;
                    }
                    else{
                        cnt++;
                        a++;
                        b--;
                    }
            }


        System.out.println(cnt);
    }
}
