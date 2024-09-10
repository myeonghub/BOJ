import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr ;
    static boolean[][] check;
    static int[] dy= {1,0,0,-1};
    static int[] dx= {0,1,-1,0};
    static int nx,ny, n , m ;
    static boolean checksum;
    static Queue<int []> que = new LinkedList<int []>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        check = new boolean[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] ==1){
                    que.add(new int[]{i,j,0});
                }
            }
        }
        int q = bfs(que);

        if(checkAll()) {
            System.out.println(q);
        }
        else {
            System.out.println(-1);
        }
    }

    public static int bfs(Queue<int[]> que){
        int days =0;
        while (!que.isEmpty()){
            int[] tmp = que.poll();
            int qy = tmp[0];
            int qx = tmp[1];
            int day = tmp[2];
            days = Math.max(days,day );
            for(int i =0;i<4;i++){
                nx = qx + dx[i];
                ny = qy + dy[i];

                if(nx >=0 && ny >=0 && nx<m && ny<n &&arr[ny][nx]==0 ){
                    arr[ny][nx] = 1;
                    que.add(new int[]{ny,nx,day +1 });
                }
            }
        }

        return days;

    }
    public static boolean checkAll(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {  // 익지 않은 토마토가 있으면 false
                    return false;
                }
            }
        }
        return true;
    }
}
