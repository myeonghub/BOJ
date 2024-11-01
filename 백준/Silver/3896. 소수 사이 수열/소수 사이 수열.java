import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[1299710];
        prime[0] = false;
        prime[1] = false;
        for(int i=2;i<=1299709;i++){
            prime[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(1299709); i++) { //에라토스테네스의 체
            if (prime[i]) {
                for (int j = i * i; j <= 1299709; j+=i) {
                    prime[j] =false;
                }
            }
        }
        int s=0;
        int e=0;
        for(int i=0;i<n;i++){
            int k = Integer.parseInt(br.readLine());
            if(prime[k]){
                sb.append(0+"\n");
            }
            else{
                s=k;
                e=k;
                while (s > 0 && !prime[s]) {
                    s--;
                }

                while (e < prime.length && !prime[e]) {
                    e++;
                }
                sb.append( (e-s)+ "\n");
            }

            
        }

        System.out.println(sb);
    }

}
