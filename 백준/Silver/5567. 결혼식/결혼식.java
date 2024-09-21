import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr;
    static boolean [] visit;
    static int n,k,count;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        boolean bool = false ;
        visit = new boolean[n+1];
        for(int i=0;i<k;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] =1;
            if(a==1 || b==1){
                bool = true;
            }
        }

        if(bool){
            visit[1] = true;
            bfs(1);
            System.out.println(count);
        }
        else {
            System.out.println(0);
        }




    }

    public static void bfs(int a) {
        Queue<int[] > que = new LinkedList<>();
        count =0;
        que.add(new int [] {a,0});
        int [] tmp = new int[2];
        
        while (!que.isEmpty()){
            
            tmp = que.poll();
            int friend = tmp[1];
            if(friend>=2){
                continue;
            }
            for(int i=1;i<=n;i++){
                if(arr[tmp[0]][i]==1&&!visit[i]){
                    count++;
                    visit[i]= true;
                    que.add(new int [] {i,friend+1});
                }
            }
        }
    }
}
