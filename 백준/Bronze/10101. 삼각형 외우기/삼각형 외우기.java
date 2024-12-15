import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int sum = 0;
        sum += n+m+k;

        if(sum!=180){
            System.out.println("Error");
            return;
        }

        if(n==60 && m==60 && k==60){
            System.out.println("Equilateral");
            return;
        }
        if(n!=m && n!=k && m!=k){
            System.out.println("Scalene");
            return;
        }
        if(n==m || n==k || m==k){
            System.out.println("Isosceles");
            return;
        }

    }
}


