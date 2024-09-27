import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,k;
    static int [][] arr ;
    static boolean [][] check;
    static int []count ;
    static int[] dy= {1,0,0,-1};
    static int[] dx= {0,1,-1,0};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        count = new int[101];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(k=1;k<100+1;k++) {
            check = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] >= k && !check[i][j]) {
                        bfs(i, j);
                        count[k]++;
                    }
                }
            }
        }

        Arrays.sort(count);
        System.out.println(count[count.length-1]);


    }

    public static void bfs(int y, int x) {
        Queue<int []> que = new LinkedList<>();

        que.add(new int[]{y,x});
        int[] tmp = new int[2];
        int qx ,qy =0;
        check[y][x] =true;
        while (!que.isEmpty()){
            tmp = que.poll();
            for(int i=0;i<4;i++){
                qx = tmp[1] + dx[i];
                qy = tmp[0] + dy[i];
                if(qx<0 ||qy<0 || qx>=n ||qy>=n){
                    continue;
                }
                if(arr[qy][qx] >=k && !check[qy][qx]){
                    check[qy][qx] =true;
                    que.add(new int[]{qy,qx});
                }
            }
        }
    }
}
