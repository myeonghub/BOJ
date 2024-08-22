import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        st = st.toLowerCase();

        int[] arr = new int[26];


        int max =0;
        for(int i =0;i<st.length();i++){
            arr[st.charAt(i) - 'a'] +=1;
        }

        char ch = ' ' ;
        for(int j =0;j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
                ch = (char) (j+ 'A');
            }
            else if(max == arr[j]){
                ch ='?';
            }
        }

        System.out.println(ch);



    }
}
