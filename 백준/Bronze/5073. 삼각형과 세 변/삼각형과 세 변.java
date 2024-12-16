import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if(arr[0]==0 && arr[1]==0 && arr[2]==0){
                return;
            }

            int max= 0;
            int sum= 0;

            for(int i =0;i<3;i++){
                if(max<arr[i]){
                    max = arr[i];
                }
                sum += arr[i];
            }

            if ((sum-max) <= max ){
                System.out.println("Invalid");
                continue;
            }

            if (arr[0] == arr[1] && arr[1] == arr[2] ) {
                System.out.println("Equilateral");
            }
            else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1]==arr[2]) {
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }


        }

    }
}


