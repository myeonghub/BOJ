import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        String str = sc.next();

        Character [] arr = new Character[str.length()];

//        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i= 0; i<str.length();i++){
            arr[i] = str.charAt(i);
        }





        Arrays.sort(arr, (o1, o2) -> {
            return o2 - o1 ;
        });



        for(Character i : arr) {
            sb.append(i-'0');
        }

        System.out.println(sb);



    }
}
