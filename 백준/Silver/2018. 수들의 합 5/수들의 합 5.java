import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int sum =1;
        int ptr1 = 1;
        int ptr2 = 1;

        int cnt = 1;


        while(ptr2!=n){
            if(sum ==n){
                ptr2++;
                cnt +=1;
                sum+=ptr2;
            }
            else if(sum>n){
                sum-=ptr1;
                ptr1++;
            }
            else{
                ptr2++;
                sum+=ptr2;

            }
        }
        System.out.println(cnt);

    }
}
