import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr ;
    static boolean[][][] chk ;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int n,m;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        chk = new boolean[2][n][m];
        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = str.charAt(j) - '0';

            }
        }

        int dist = bfs(0,0);

        
        System.out.println(dist==0?-1:dist);

    }


    public static int bfs(int a, int b){
        ArrayDeque <Node> que = new ArrayDeque<>();


        Node tmp ;
        que.add(new Node(0,a,b,1));


        while (!que.isEmpty()){
            tmp = que.poll();

            if(tmp.x==n-1 && tmp.y ==m-1){
                return tmp.d;
            }

            for(int i=0;i<4;i++){
                int x = dx[i] + tmp.x;
                int y = dy[i] + tmp.y;



                if(x<0 || y<0 || x>=n || y>=m){
                    continue;
                }

                if(arr[x][y] ==0 && !chk[tmp.c][x][y]){
                    chk[tmp.c][x][y] = true;
                    que.add(new Node(tmp.c,x,y,tmp.d+1));
                }
                else if(arr[x][y] == 1 && !chk[1][x][y] && tmp.c==0 ){
                    chk[1][x][y] = true;
                    que.add(new Node(1,x,y,tmp.d+1));
                }
            }
        }

        return -1;


    }


    public static class Node{
        int x;
        int y;
        int c;
        int d;
        Node(int c,int x, int y, int d ){
            this.x = x;
            this.y = y;
            this.c = c;
            this.d = d;
        }
    }
}
