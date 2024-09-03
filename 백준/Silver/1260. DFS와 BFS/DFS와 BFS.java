import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean check[];
    static int [][] arr ;
    static StringBuilder sb = new StringBuilder();
    static int a,b,c;
    static Queue<Integer>  que = new LinkedList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a =Integer.parseInt(st.nextToken());
        b =Integer.parseInt(st.nextToken());
        c= Integer.parseInt(st.nextToken());

        arr = new int[a+1][a+1];

        check = new boolean[a+1];
        for(int i=0;i<b;i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st1.nextToken());
            int q = Integer.parseInt(st1.nextToken());

            arr[w][q] = 1;
            arr[q][w] = 1;
        }
            dfs(c);
            sb.append("\n");

            check = new boolean[a+1];

            bfs(c);
            System.out.println(sb);




    }

    public static void dfs(int start){
        check[start] = true;
        sb.append(start + " ");
        for(int i =1; i<=a;i++){
            if(!check[i] && arr[start][i]==1){
                dfs(i);
            }
        }
    }
    public static void bfs(int start){
        que.add(start);
        check[start] = true;

        while (!que.isEmpty()){
            start = que.poll();
            sb.append(start + " ");
            for(int i =1; i<=a;i++){
                if(!check[i] && arr[start][i]==1){
                    que.add(i);
                    check[i] = true;
                }
            }
        }
    }

}
