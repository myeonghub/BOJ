import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n-1];
        int dasom = Integer.parseInt(br.readLine());
        if(n==1){
            System.out.println(0);
            return;
        }
        for(int i= 0;i<n-1;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;

        while(true) {

            Arrays.sort(arr, Collections.reverseOrder());
            if(dasom<=arr[0]) {
                arr[0] -= 1;
                dasom += 1;
                cnt++;
            }
            else{
                break;
            }
        }

        System.out.println(cnt);




    }
}
