import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();

        String A ="AAAA";
        String B = "BB";

        String ans ="";
        str = str.replaceAll("XXXX",A);
        ans = str.replaceAll("XX",B);

        if(ans.contains("X")){
            System.out.println(-1);
            return;
        }

        System.out.println(ans);



    }
}
