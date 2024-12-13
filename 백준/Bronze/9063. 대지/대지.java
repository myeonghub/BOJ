import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] h = new int[n];
        int [] w = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
                h[i]= Integer.parseInt(st.nextToken());
                w[i]= Integer.parseInt(st.nextToken());

        }

        if(n==1){
            System.out.println( 0);
            return;
        }
        Arrays.sort(h);
        Arrays.sort(w);

        int height = h[n-1] - h[0];
        int width = w[n-1] - w[0];

        System.out.println(height*width);
    }
}


