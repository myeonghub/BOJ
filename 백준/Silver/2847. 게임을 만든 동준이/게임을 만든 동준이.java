import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws  Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int count = 0;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = n-1; i>=0;i--){
            if(i==0){
                break;
            }
            if(arr[i-1]>=arr[i]){
                count += arr[i-1] - (arr[i] -1);
                arr[i-1] = arr[i] -1;
            }
        }

        System.out.println(count);



    }
}
