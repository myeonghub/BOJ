import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i =0;i<n;i++){
            String str = br.readLine();
            String[] st = str.split(",");
            int a = Integer.parseInt(st[0]) + Integer.parseInt(st[1]);
            System.out.println(a);
        }
    }
}
