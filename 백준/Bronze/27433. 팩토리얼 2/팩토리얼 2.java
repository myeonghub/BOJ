import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static Long sum ;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        sum = 1L;
        factorial2(n);
        System.out.println(sum);
    }

    public static void factorial2(int n){
        if(n ==0){
            return;
        }
        sum *=n;
        n--;
        factorial2(n);
    }
}
