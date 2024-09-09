import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,a,b,c,u,y,count;
    static int[][] arr ;
    static int[] dy= {1,0,0,-1};
    static int[] dx= {0,1,-1,0};
    static boolean[][] check;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        n = Integer.parseInt(br.readLine());
        for (int j = 0; j < n; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());


            check = new boolean[a][b];
            arr = new int[a][b];
            for (int i = 0; i < c; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                u = Integer.parseInt(st1.nextToken());
                y = Integer.parseInt(st1.nextToken());

                arr[u][y]=1;
            }
            count = 0;

            for(int l=0;l<a;l++){
                for(int t=0;t<b;t++) {
                    if (!check[l][t] && arr[l][t]==1) {
                        bfs(l,t);
                    }
                }
            }
            sb.append(count + "\n");

        }

        System.out.println(sb);
    }

    public static void bfs(int a , int b){
        count++;
        Queue<int []> que = new LinkedList<int []>();
        que.add(new int[] {a,b});

        int qx,qy;

        check[a][b] = true;

        int[] tmp = new int[2];
        int nx , ny ;

        while (!que.isEmpty()){
            tmp = que.poll();
            qx = tmp[0];
            qy = tmp[1];

            for(int i =0;i<4;i++){
                nx = dx[i] + qx;
                ny = dy[i] + qy;
                if(ny <0 || nx <0 || nx>=check.length || ny>=check[0].length){
                    continue;
                }
                if(!check[nx][ny] && arr[nx][ny]==1){
                    check[nx][ny] = true;
                    que.add(new int[] {nx,ny});
                }
            }
        }
    }
}
