import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] st = str.split("");
        int m = str.length()/2;
        int k = str.length()%2;
        for(int i =0;i<m;i++){
            char c = str.charAt(i);
            if(c!= str.charAt(str.length()-(i+1))){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);

    }

}
