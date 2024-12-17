import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());



            int max= 0;
            int sum= 0;

            for(int i =0;i<3;i++){
                if(max<arr[i]){
                    max = arr[i];
                }
                sum += arr[i];
            }
            if(arr[0]==arr[1] && arr[0]==arr[2]){
                System.out.println(sum);
                return;
            }

            int tmp = sum-max;
            if(tmp-1 < max) {
                max = tmp - 1;
            }


            System.out.println(tmp+max);




    }
}


