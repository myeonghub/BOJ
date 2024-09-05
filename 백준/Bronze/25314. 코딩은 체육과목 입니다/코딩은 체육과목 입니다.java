import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int k =n/4;
        for(int j=0;j<k;j++){
            System.out.print("long" + " ");
        }
        System.out.println("int");
        
    }
}
