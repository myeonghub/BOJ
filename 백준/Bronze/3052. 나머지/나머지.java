
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[10];

        for(int i =0;i<10;i++){
            int n = Integer.parseInt(br.readLine());
            int k= n%42;
            arr[i] = k;
        }
        arr = Arrays.stream(arr).distinct().toArray();

        System.out.println(arr.length);
        
        


    }
}