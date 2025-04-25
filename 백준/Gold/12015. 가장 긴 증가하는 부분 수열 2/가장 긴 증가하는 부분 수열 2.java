import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr));

    }

    static int solution(int[] arr){
        List<Integer> dp = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if (dp.isEmpty()) {
                dp.add(arr[i]);
                continue;
            }
            int n = find(arr[i], dp);
            if (n==dp.size()) {
                dp.add(arr[i]);
            }
            else dp.set(n, arr[i]);
        }
        return dp.size();
    }

    static int find(int n, List<Integer> dp) {
        int s = 0;
        int e = dp.size()-1;

        if (dp.get(s)>=n) return 0;
        if (dp.get(e)<n) return dp.size();

        while (s+1!=e) {
            int mid = (s+e)/2;
            if (dp.get(mid)<n) {
                s = mid;
            } else {
                e = mid;
            }
        }

        return e;
    }
}
