import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();

        int [] arr = new int[26];

        Arrays.fill(arr,-1);

        for(int i =0;i<string.length();i++){
            char c = string.charAt(i);
            if(arr[c-'a'] <0) {
                arr[c - 'a'] = i;
            }
            
        }

        for( int i : arr){
            System.out.print(i + " ");
        }


    }
}
