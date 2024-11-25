import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] ch = new char[str.length()+1];

        int j =Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        int[] arr = new int[str.length()+1];

        for(int h=0;h<j;h++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] n = new char[1];
            n[0] = st.nextToken().charAt(0);
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());


            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                ch[i] = str.charAt(i);
                if (n[0] == ch[i]) {
                    cnt++;
                }
                arr[i] = cnt;
            }
            if(m==0){
                sb.append(arr[k] - arr[m] +arr[m] + "\n" );
            }
            else {
                sb.append(arr[k] - arr[m - 1] + "\n");
            }

        }

        System.out.println(sb);



    }
}
