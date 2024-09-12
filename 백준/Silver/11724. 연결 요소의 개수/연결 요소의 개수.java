import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] check;

    static int  n,a,b;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        check = new boolean[n+1];

        for(int i=0;i<k;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st1.nextToken());
            b = Integer.parseInt(st1.nextToken());

            arr[a][b] = arr[b][a] =1;
        }
        int count = 0;
        for(int i=1;i<=n;i++){
            if(!check[i]){
                bfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

    public static void bfs(int a){
        Queue<Integer> que = new LinkedList<>();
        que.add(a);

        while (!que.isEmpty()){
            int tmp = que.poll();

            for(int i=1;i<n+1;i++){
                if(arr[tmp][i] ==1 && !check[i]){
                        que.add(i);
                        check[i]= true;
                }
            }
        }

    }
}
