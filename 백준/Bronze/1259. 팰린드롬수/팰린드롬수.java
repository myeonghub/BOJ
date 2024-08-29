import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            String str = br.readLine();
            if(str.equals("0")){
                break;
            }
            Boolean bl = true;
            for(int i =0;i<(str.length()/2);i++){
                char c = str.charAt(i);
                if(c != str.charAt(str.length()-(i+1))){
                    System.out.println("no");
                    bl = false;
                    break;
                }
            }
            if(bl) {
                System.out.println("yes");
            }
        }

    }
}
