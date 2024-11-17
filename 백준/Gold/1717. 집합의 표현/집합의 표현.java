import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static boolean check;
    static int[] parents;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());



        parents = new int[n + 1];
        for (int j = 1; j <= n; j++) {
            parents[j] = j;
        }

        for(int i=0;i<m;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int ip = Integer.parseInt(st1.nextToken());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());


            if(ip ==0){
                union(a,b);
            }
            else if(ip ==1){
                if(findParent(a) == findParent(b)){
                    sb.append("YES" + "\n");
                }
                else{
                    sb.append("NO" + "\n");
                }



            }
        }
        System.out.println(sb);
    }




    static int findParent(int x) {
        if (x == parents[x]) return x;
        return parents[x] = findParent(parents[x]);
    }

    static void union(int x, int y) {
        int px = findParent(x);
        int py = findParent(y);
        if (px != py) parents[py] = px;
    }

}
