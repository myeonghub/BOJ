import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        Long[] preSum = new Long[N+1];
        Long sum = 0l;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sum += Long.parseLong(st.nextToken());
            preSum[i] = sum;
        }

        long cnt = 0l;
        Map<Long,Long> m = new HashMap<>();

        for(int i = 1; i <= N; i++){
            if(preSum[i] == K){
                cnt++;
            }

            cnt += m.getOrDefault(preSum[i] - K,0L);
            m.put(preSum[i] , m.getOrDefault(preSum[i] , 0L) + 1);
        }
        System.out.println(cnt);


    }

    static void solution(int N, int K, int[] arr) {

    }
}
