import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        System.out.println(bfs());
    }

    public static int bfs(){
        Queue<int []> que = new LinkedList<>();
        que.add(new int[]{n,0});

        boolean[] visited = new boolean[100001]; // 방문 여부를 기록하는 배열
        visited[n] = true;

        while (!que.isEmpty()){
            int[] k = que.poll();
            if(k[0]==m){
                return k[1];
            }
            int a =k[0]*2;
            int b =k[0]+1;
            int c =k[0]-1;
            if(a<=100000 && !visited[a]){
                visited[a] = true;
                que.add(new int[]{a,k[1]+1});
            }
            if(b<=100000 && !visited[b]){
                visited[b] = true;
                que.add(new int[]{b,k[1]+1});
            }
            if(c >= 0 && !visited[c]){
                visited[c] = true;
                que.add(new int[]{c,k[1]+1});
            }

        }
        return -1;
    }
}
