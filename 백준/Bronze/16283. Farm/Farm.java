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
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int solutionCount = 0;
        int sheep = -1;
        int goat = -1;

        for (int x = 1; x < n; x++) {
            int y = n - x; 

            if (a * x + b * y == w) {
                solutionCount++;
                sheep = x;
                goat = y;
            }
        }

        if (solutionCount == 1) {
            System.out.println(sheep + " " + goat);
        } else { 
            System.out.println(-1);
        }
    }
}