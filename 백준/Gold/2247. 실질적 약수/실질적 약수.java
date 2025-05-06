import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        for(int i = 2; i <= N/2; i++) {
                sum += i * (N / i - 1);
        }
        System.out.println(sum%1000000);

    }
}
