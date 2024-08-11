
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());

        
        int count =0;



       while (a>0) {
            if (a % 5 == 0) {
                count += a / 5;
                break;
            } else {
                a -= 3;
                count++;
            }
            if (a < 0) {
                count = -1;
                break;
            }
        }
        
        System.out.println(count);
        


    }
}