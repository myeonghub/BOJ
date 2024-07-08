import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [][] arr = new int[n][2];

        for(int i =0; i<n; i++){
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(arr, (o1,o2) -> {
            if(o1[1]==o2[1]){
                return o1[0] - o2[0] ;
            }
            return o1[1] - o2 [1];
        });


        int count = 0;
        int end_time = 0;


        for(int i=0;i<n; i++){
            if(end_time <= arr[i][0]){
                end_time = arr[i][1];
                count ++;
            }
        }


        System.out.println(count);


    }
}
