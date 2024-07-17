import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();


        for(int i = 0 ; i< n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);


        for(int i : arr) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);






    }


}
