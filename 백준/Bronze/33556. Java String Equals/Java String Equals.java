import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A  = br.readLine();
        String B = br.readLine();



        if(A.equals("null") || A.isEmpty()){
            System.out.println("NullPointerException");
            System.out.println("NullPointerException");
            return;
        }
        else if(B.equals("null")){
            System.out.println("false");
            System.out.println("false");
            return;
        }

        if(A.equals(B)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(A.equalsIgnoreCase(B)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
