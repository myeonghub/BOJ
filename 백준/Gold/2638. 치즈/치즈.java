import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dy= {1,0,0,-1};
    static int[] dx= {0,1,-1,0};
    static int[][] arr;
    static int cnt  ;

    static int n , m;
    static boolean [][] check;
    static boolean  chk;
    static Queue<int []> que2 = new LinkedList<>();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];


        int time = 0;
        for(int i =0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        while(true){
            check = new boolean[n][m];
            chk = false;
            outside(0,0);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] ==1 && !check[i][j]) {
                        sanso(i,j);

                    }
                }
            }

            while (!que2.isEmpty()) {
                int[] tmp = que2.poll();
                arr[tmp[0]][tmp[1]] = 0;
            }

            if (chk) time++;
            else break;
        }

        System.out.println(time);

    }

    public static void outside(int a, int b){
        check[a][b] = true;
        arr[a][b] = 2;

        for (int i = 0; i < 4; i++) {
            int nx = a + dx[i];
            int ny = b + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if (check[nx][ny] || arr[nx][ny] == 1) continue;

            outside(nx, ny);
        }
    }

    public static void sanso(int a, int b){
        Queue<int []> que = new LinkedList<>();

        que. add(new int []{a,b});
        int [] tmp = new int[2];

        while(!que.isEmpty()){
            tmp = que.poll();
            cnt =0;
            for(int i =0;i<4;i++){
                int x = dx[i] + tmp[0];
                int y = dy[i] + tmp[1];

                if(x<0 ||y<0 || x>=n ||y>=m){
                    continue;
                }

                if(arr[x][y] ==2 ){
                    cnt++;
                }
                else if(arr[x][y] ==1 && !check[x][y]){
                    check[x][y] =true;
                    que.add(new int[]{x,y});
                }

                if(cnt >=2){
                    chk =true;
                    que2.add(new int []{tmp[0],tmp[1]});
                }
            }


        }


    }
}
