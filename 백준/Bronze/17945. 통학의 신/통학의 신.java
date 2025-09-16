import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;





public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        a *= 2;
        int result1 = (-a + (int)(Math.sqrt(a*a - 4*b)))/2;
        int result2 = (-a - (int)(Math.sqrt(a*a - 4*b)))/2;

        
        System.out.println(result1 == result2 ?result1 : result1 < result2 ? result1 + " " + result2 : result2 + " " + result1 );
    }



}

