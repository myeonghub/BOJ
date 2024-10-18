import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M = 0;

        for(int i = 1; i <= N; i++) {
            int number = i;
            int res = 0;

            while(number > 0){ // 각 자릿 수를 구하는 식 10씩 계속 나눠서 자릿수의 합을 구함
                res += number % 10;
                number /= 10;
            }

            if(res + i == N){
                M = i;
                break;
            }
        }

        System.out.println(M);
    }
}
