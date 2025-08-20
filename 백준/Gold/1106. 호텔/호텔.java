import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


//class Node implements Comparable<Node>{
//    int y;
//    int x;
//    int wall;
//
//    public Node(int y, int x, int wall) {
//        this.y = y;
//        this.x = x;
//        this.wall = wall;
//    }
//
//    @Override
//    public int compareTo(Node o) {
//        // 오름차순
//        return wall - o.wall;
//    }
//}
public class Main {
    static int n , p, q;
    static int m , k;
    static Long x , y;
    static int cnt;

    static int paint;
    static int area;



    static int[] X = {0,0,-1,1};
    static int[] Y = {1,-1,0,0};

    static HashMap<Long,Long> hash = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[k + 1][2];

        for (int i = 1; i < k + 1; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+100];

        Arrays.fill(dp,9999999);
        dp[0] = 0;

        for(int i = 1; i < k + 1; i++){
            for(int j = arr[i][1]; j < n + 100; j++){
                if(j - arr[i][1] >= 0){
                    dp[j] = Math.min(dp[j] , arr[i][0] + dp[j-arr[i][1]]);
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i = n; i < n+100; i++){
            result = Math.min(result,dp[i]);
        }

        System.out.println(result);
    }
}

