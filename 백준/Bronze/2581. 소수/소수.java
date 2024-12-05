import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int m =Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int [] arr = new int[m+1];

        int cnt =n;
        Long sum = 0L;
        List<Integer> prime = new ArrayList();
        while(cnt<=m){
            boolean check = false;
            for(int i=2;i<=Math.sqrt(cnt);i++){
                if(cnt%i ==0){
                    check = true;
                    break;
                }
            }
            if(!check && cnt!=1){
                arr[cnt] = 1;
                prime.add(cnt);
                sum += cnt;
            }
            cnt++;
        }

        if(sum>0) {
            System.out.println(sum);
            System.out.println(prime.get(0));
        }
        else{
            System.out.println(-1);
        }
    }
}
