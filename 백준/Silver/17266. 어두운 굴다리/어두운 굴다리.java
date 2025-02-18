import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n ;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int m = Integer.parseInt(br.readLine());


        int[] arr = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr, m));

    }

    public static int solution(int[] arr, int m) {
        int start = 0;
        int end = n;
        int result = 0;
        while (start <= end) {
            int mid = (start + end)  >> 1;
            if (light(arr, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;

    }

    public static boolean light(int[] arr, int mid) {
        int pr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - mid <= pr) {
                pr = arr[i] + mid;
            } else {
                return false;
            }
        }
        if (n - pr > 0) {
            return false;
        } else {
            return true;
        }
    }

}
