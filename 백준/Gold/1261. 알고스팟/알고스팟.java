import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Node implements Comparable<Node>{
    int y;
    int x;
    int wall;

    public Node(int y, int x, int wall) {
        this.y = y;
        this.x = x;
        this.wall = wall;
    }

    @Override
    public int compareTo(Node o) {
        // 오름차순
        return wall - o.wall;
    }
}
public class Main {
    static int N;
    static int M;

    static int[] X = {0,0,-1,1};
    static int[] Y = {1,-1,0,0};


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        boolean[][] visit = new boolean[N][M];


        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }


        System.out.println(bfs(arr,visit));


    }
    static int bfs (int[][] arr , boolean[][] visit) {
        PriorityQueue<Node> que = new PriorityQueue<>();
        visit[0][0] = true;

        que.add(new Node(0,0,0));

        while(!que.isEmpty()){
            Node pos = que.poll();

            int px = pos.x;
            int py = pos.y;
            int pwall = pos.wall;

            if(py == N - 1 && px == M - 1){
                return pos.wall;
            }

            for(int i = 0; i < 4; i++){
                int b = Y[i] + py;
                int a = X[i] + px;
                if(b < 0 || a < 0 || a >= M || b >= N){
                    continue;
                }
                if(arr[b][a] == 1 && !visit[b][a]){
                    visit[b][a] = true;
                    que.add(new Node(b,a,pwall + 1));
                }
                else if(arr[b][a] == 0 && !visit[b][a]){
                    visit[b][a] = true;
                    que.add(new Node(b,a,pwall));
                }
            }
        }

        return 0;

    }

}

