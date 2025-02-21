import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = br.readLine();
        }
        Arrays.sort(str, ( a,  b) ->   b.length() - a.length());
        System.out.println(solution(str));

    }
    static int solution(String[] str ){
        int [] arr = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                arr[str[i].charAt(j) - 'A'] += (int) Math.pow(10, str[i].length() - 1 - j );
            }
        }
        Arrays.sort(arr);
        int sum =0;
        int j =25;
        for(int i=9;i>=0;i--){
            sum += arr[j] * i;
            j--;
        }
        return sum;
    }

}
