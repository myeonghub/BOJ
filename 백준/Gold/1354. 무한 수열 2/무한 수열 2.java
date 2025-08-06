import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static Long n , p, q;
    static int m;
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

        n = Long.parseLong(st.nextToken());

        p = Long.parseLong(st.nextToken());

        q = Long.parseLong(st.nextToken());

        x = Long.parseLong(st.nextToken());

        y = Long.parseLong(st.nextToken());

        hash.put(0l,1l);


        System.out.println(dp(n));

    }

    static long dp (Long k){
        if(hash.containsKey(k)){
            return hash.get(k);
        }
        long f;
        long s;

        if((k/p - x) < 0l){
             f = 1;
        }else{
             f = dp((long)Math.floor(k/p) - x);
        }
        if((k/q) - y < 0l){
             s = 1;
        }
        else {
             s = dp((long) Math.floor(k / q) - y);
        }

        hash.put(k,f+s);

        return f+s;
    }
}

