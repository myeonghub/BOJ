import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb =new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[4];



        int [] min = new int[4];

        for(int i=0;i<4;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        min[0] = arr[0];
        min[1] = arr[1];
        min[2] = arr[2] -arr[0];
        min[3] = arr[3] - arr[1];

        Arrays.sort(min);

        System.out.println(min[0]);
    }
}


