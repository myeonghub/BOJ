import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);

        int[] d = new int[m];


        for (int i = 0; i < m; i++) {
            d[i] = Integer.parseInt(br.readLine());

            int start = 0;
            int end = a.length - 1;

            boolean chk = false;
            int tmp = Integer.MAX_VALUE;
            while (start <= end) {
                int mid = (start + end) / 2;

                if (a[mid] < d[i]) {
                    start = mid + 1;
                } else if (a[mid] > d[i]) {
                    end = mid - 1;
                } else {
                    if (tmp > mid) {
                        tmp = mid;
                    }
                    chk = true;
                    end = mid - 1;
                }
            }

            if (!chk) {
                sb.append(-1 + "\n");
            } else {
                sb.append(tmp + "\n");
            }
        }
        System.out.println(sb);
    }
}
