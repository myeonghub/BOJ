import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int T = Integer.parseInt(st.nextToken());
            int[] arr = new int[T];

            for (int j = 0; j < T; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(solution(T,arr));
        }
    }

    static long solution(int T, int[] arr) {
        long sum = 0;
        for (int i = 0; i < T - 1; i++) {
            for (int j = i + 1; j < T; j++) {
                sum += gcd(arr[i], arr[j]);
            }
        }
        return sum;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
