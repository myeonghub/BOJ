import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());



        for(int i =0;i<n;i++){
            String str = br.readLine();
            int sum =0;
            int k = 0;
            for(int j =0;j<str.length();j++){
                if(str.charAt(j) == 'O'){
                    k+=1;
                    sum += k;
                }
                else {
                    k=0;
                }
            }
            System.out.println(sum);
        }
    }
}
