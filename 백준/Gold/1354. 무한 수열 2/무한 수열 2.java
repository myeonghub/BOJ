import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static long N ,P,Q,X,Y;
    static Map<Long,Long> mp = new HashMap<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Long.parseLong(st.nextToken());
        P = Long.parseLong(st.nextToken());
        Q = Long.parseLong(st.nextToken());
        X = Long.parseLong(st.nextToken());
        Y = Long.parseLong(st.nextToken());

        mp.put(0L,1L);

        System.out.println(DP(N));
    }

    public static long DP(long n){
        if(mp.containsKey(n)){
            return mp.get(n);
        }
        long first = 0;
        long second = 0;
        if((long)Math.floor(n/P)-X >0 ) {
            first = DP((long) Math.floor(n / P) - X);
        }
        else{
            first = DP(0);
        }
        if( (long)Math.floor(n/Q)-Y >0){
            second = DP((long)Math.floor(n/Q)-Y);
        }
        else{
            second = DP(0);
        }


        mp.put(n,first+second);
        return first+second;
    }
}
