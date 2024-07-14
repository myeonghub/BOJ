import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;

        String[] str = br.readLine().split("-");

        for(int i=0; i<str.length;i++){
            int temp =0;

            String[] str2 = str[i].split("\\+"); //정규표현식 빠져나오기 위한 +대신하기 위해 \\+

            for(int j =0; j<str2.length;j++){
                temp += Integer.parseInt(str2[j]);
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }
            else {
                sum -= temp;
            }
        }

        System.out.println(sum);


    }
}
