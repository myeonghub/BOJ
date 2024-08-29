import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        String str = br.readLine();

        for(int i =0; i<str.length();i++){
            int j = str.charAt(i) - 'a';
            arr[j] +=1;
        }
        for(int k=0;k<26;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
