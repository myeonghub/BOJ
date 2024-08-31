import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] st = str.split(" ");

        int i = Integer.parseInt(st[1]);
        int decimical = 0;
        int pow =1;


        for(int j=st[0].length()-1;j>=0;j--){
            int digit;
            char ch = st[0].charAt(j);

            if(ch >= '0' && ch<= '9'){
                digit = ch -'0';
            }
            else {
                digit = ch + 10 - 'A';
            }

            decimical += digit*pow;
            pow *= i;
        }

        System.out.println(decimical);
    }
}
