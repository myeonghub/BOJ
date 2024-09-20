import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        int count =0;
        if(n==1){
            count =1;
        }
        else if(n==2){
            count = Math.min((k+1)/2, 4);
        }
        else{
            if(k<7) {
                count = Math.min(k , 4);
            }
            else {
                count=k-2;
            }
        }

        System.out.println(count);
    }
}
