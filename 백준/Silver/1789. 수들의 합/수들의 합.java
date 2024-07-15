import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long k = 0;
        long sum = 0;


        while (n>=sum){
            k++;
            sum += k;
        }

        System.out.println(k-1);
    }
}
