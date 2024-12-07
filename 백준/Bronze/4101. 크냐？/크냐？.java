import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n =Integer.parseInt(st.nextToken());
            int m =Integer.parseInt(st.nextToken());
            if((n+m)==0){
                break;
            }
            if (n > m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
