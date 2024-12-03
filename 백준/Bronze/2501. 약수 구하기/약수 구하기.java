import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());


        ArrayList<Integer> list = new ArrayList();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                list.add(i);
            }
        }

        sort(list);

        if(list.size()>=m) {
            System.out.println(list.get(m - 1));
        }
        else{
            System.out.println(0);
        }
    }
}
