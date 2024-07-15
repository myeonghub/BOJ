import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int [] arr = {300,60,10};
        int [] arr2 = new int[3];

        int n = Integer.parseInt(br.readLine());


            if(n/arr[0]>0){
                arr2[0] = (n/arr[0]);
                n -= arr[0]*(arr2[0]);
            }
            if(n/arr[1]>0){
                arr2[1] = (n/arr[1]);
                n -= arr[1]*(arr2[1]);
            }
            if(n/arr[2]>0){
                arr2[2] = (n/arr[2]);
                n -= arr[2]*(arr2[2]);
            }
        if(n==0) {
            for (int i = 0; i < 3; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
        else {
            System.out.println(-1);
        }

    }

}
