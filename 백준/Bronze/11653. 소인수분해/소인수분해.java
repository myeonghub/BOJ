import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb =new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList();

        if(n==1){
            return;
        }

        while(true) {
            if(n==1){
                break;
            }
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    arr.add(i);
                    n = n/i;
                    break;
                }
            }
        }

        for(int i=0;i<arr.size();i++){
            sb.append(arr.get(i) + "\n");
        }
        System.out.println(sb);
    }
}


