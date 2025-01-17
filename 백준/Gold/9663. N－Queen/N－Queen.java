import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    static int[] chesspan;
    static int n, cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        chesspan = new int[n];

        dfs(0);

        System.out.println(cnt);

    }

    public static void dfs(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            chesspan[depth] = i;
            if (check(depth)) {
                dfs(depth + 1);
            }
        }
    }

    public static boolean check(int depth) {
        for (int i = 0; i < depth; i++) {
            if (chesspan[i] == chesspan[depth]) {
                return false;
            } else if (depth - i == Math.abs(chesspan[depth] - chesspan[i])) {
                return false;
            }
        }
        return true;
    }


}
