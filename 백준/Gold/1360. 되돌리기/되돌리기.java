import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int r = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<String[]> list = new ArrayList<String[]>();
        for(int i=0;i<r;i++) {
            String str = br.readLine();
            String[] st = str.split(" ");
            list.add(st);
        }

        long cnt = 0;
        int k = list.size()-1;
        boolean chk = false;

        while(k>=0){
            String[] st = list.get(k);
            long q = Long.parseLong(st[2]);
            if( chk) {
                if (q >= cnt) {
                    k--;
                    continue;
                }
            }

            if (st[0].equals("undo")) {
                chk = true;
                long p = Long.parseLong(st[1]);
                cnt = q-p;
                k--;
            }
            else if(st[0].equals("type")){
                sb.insert(0, st[1]);
                k--;
            }
        }


        System.out.println(sb);

    }
}
