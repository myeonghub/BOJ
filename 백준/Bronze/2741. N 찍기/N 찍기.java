import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int k = Integer.parseInt(br.readLine());

        for(int i=1;i<=k;i++){
            System.out.println(i);
        }

    }
}


