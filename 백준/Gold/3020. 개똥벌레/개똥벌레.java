import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[] even = new int[H + 2];
        int[] odd = new int[H + 2];

        for (int i = 0; i < N; i += 2) {
            odd[Integer.parseInt(br.readLine())]++;
            even[Integer.parseInt(br.readLine())]++;
        }

        solution(H, odd, even);
    }

    static void solution(int H, int[] odd, int[] even) {
        int cnt = 0;
        int min = Integer.MAX_VALUE;

        for (int i = H - 1; i >= 1; i--) {
            odd[i] += odd[i + 1];
            even[i] += even[i + 1];
        }

        for (int i = 1; i <= H; i++) {
            int sum = odd[i] + even[H - i + 1]; 
            if (sum < min) {
                cnt = 1;
                min = sum;
            } else if (sum == min) {
                cnt++;
            }
        }

        System.out.println(min + " " + cnt);
    }
}
