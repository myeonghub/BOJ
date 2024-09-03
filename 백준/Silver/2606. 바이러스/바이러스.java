import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        int[][] arr =new int[n+1][n+1];
        boolean[] check = new boolean[n+1];
        for(int i=1;i<=k;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        int vir =1;
        que.add(vir);
        check[vir] = true;
        while (!que.isEmpty()){
            vir = que.poll();
            for(int i =1;i<=n;i++){
                if(!check[i] && arr[vir][i] == 1){
                    que.add(i);
                    check[i] = true;
                }
            }

        }
        int virus = 0;
        for(int i =1;i<=n;i++){
            if(check[i]){
                virus ++;
            }
        }

        System.out.println(virus-1);
    }
}
