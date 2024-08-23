import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int k=0;k<n;k++) {
            String str = br.readLine();

            Queue que = new LinkedList();
            String[] st = str.split("");
            int a = 0;
            if (str.length() % 2 == 0) {
                for (int i = 0; i < str.length(); i++) {
                    if (st[i].equals("(")) {
                        que.add("(");
                    } else {
                        if(que.isEmpty()){
                            a=1;
                        }
                        else {
                            que.remove();
                        }
                    }
                }
                if (que.isEmpty() && a==0 ) {
                    sb.append("YES" + "\n");
                } else {
                    sb.append("NO" + "\n");
                }
            } else {
                sb.append("NO" + "\n");
            }
        }

        System.out.println(sb);

    }
}
