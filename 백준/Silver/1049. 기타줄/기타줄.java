import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [][] arr = new int[m][2];


        for(int i = 0;i<m;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine().trim());
            arr[i][0] = Integer.parseInt(st1.nextToken());
            arr[i][1] = Integer.parseInt(st1.nextToken());
        }

        int share = n/6;
        int share2 = n%6;

        int sum =0;
        Arrays.sort(arr, (o1,o2) -> {
            return  o1[1]-o2[1];
        });
        int one = arr[0][1];
        Arrays.sort(arr, (o1,o2) -> {
            return o1[0] - o2[0];
        });
        int packagePrice = arr[0][0];
        if(n<=6){
            sum = one * n;
            if(sum>packagePrice){
                sum = packagePrice;
            }
        }
        else {

            int onesix = one * 6;
            if(packagePrice>=onesix){
                sum = (onesix/6) *n;
            }
            else {
                sum = (packagePrice *share) + (one *share2);
                if(packagePrice*(share+1) < sum){
                    sum =packagePrice*(share+1);
                }
            }

        }

        System.out.println(sum);

    }
}
