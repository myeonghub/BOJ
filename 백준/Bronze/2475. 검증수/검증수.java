import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[5];
        int sum =0;
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i] = arr[i] *arr[i];
            sum+= arr[i];
        }

        System.out.println(sum%10);

    }
}
