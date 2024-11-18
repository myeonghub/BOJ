import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m,tmp,count;
    static int [] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

        arr = new int[n+1];
        count =0;
        eratostenes(2);

        System.out.println(tmp);

    }
    static void eratostenes (int a){
        tmp =a;
        while(tmp<=n) {
            if (arr[tmp] == 0) {
                arr[tmp] = 1;
                count++;
                if (count == m) {
                    return;
                }
            }
            tmp += a;
        }
        eratostenes(a+1);


    }
}
