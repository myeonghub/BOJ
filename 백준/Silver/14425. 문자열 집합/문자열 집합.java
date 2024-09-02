import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        String[] jib = new String[n];
        int count =0;
        for(int i =0;i<n;i++){
            jib[i] = br.readLine();
        }
        String strin = "";

        for(int j =0;j<k;j++){
            strin = br.readLine();
            for(int i=0;i<n;i++) {
                if (strin.equals(jib[i])){
                    count+=1;
                }
            }
        }

        System.out.println(count);
    }
}
