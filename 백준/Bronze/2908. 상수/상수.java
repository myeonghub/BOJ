import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String str2 = st.nextToken();

        String[] string = str.split("");
        String[] string2 = str2.split("");

        String ret = "";
        String ret2 = "";

        for(int i=string.length-1;i>=0;i--){
            ret= ret + string[i];
            ret2 = ret2 + string2[i];
        }

        int re = Integer.parseInt(ret);
        int re2 = Integer.parseInt(ret2);
        if(re>re2){
            System.out.println(re);
        }
        else {
            System.out.println(re2);
        }
    }
}
