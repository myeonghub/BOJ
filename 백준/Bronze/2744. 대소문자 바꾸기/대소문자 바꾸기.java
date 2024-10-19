import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char b;
        String ans = "";
        for(int i=0;i<str.length();i++){
            b = str.charAt(i);
            if(Character.isUpperCase(b)){
                ans += Character.toLowerCase(b);
            }
            else{
                ans+= Character.toUpperCase(b);
            }
        }

        System.out.println(ans);
    }
}
