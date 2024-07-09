import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[9];

        int sum =0;

        for(int i=0; i<9;i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum +=arr[i];
        }

        int check = 0;

        for(int i =0; i<8; i++){
                for (int j = i+1; j < 9; j++) {
                    if(sum-arr[i]-arr[j] == 100){
                        check =100;
                        arr[j] = 0;
                        arr[i] = 0;
                        break;
                    }
                }
                if(check==100){
                    break;
                }
        }
        Arrays.sort(arr);

        for(int k = 2; k<9; k++) {
            System.out.println(arr[k]);
        }

    }
}
