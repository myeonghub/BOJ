import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int cnt;
    static int[] X = {0,0,-1,1};
    static int[] Y = {1,-1,0,0};
    static boolean chk = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M][N];

        boolean[][] visit = new boolean[M][N];

        int startx = 0;
        int starty = 0;
        for(int i = 0; i < M; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - 'A';
                if(arr[i][j] == 14 || arr[i][j] == 15){
                    visit[i][j] = false;
                }
                else if(arr[i][j] == 23){
                    visit[i][j] = true;
                }
                else{
                    starty = i;
                    startx= j;
                }
            }
        }

        dfs(starty,startx,arr,visit);
        if(cnt == 0){
            System.out.println("TT");
            return;
        }
        System.out.println(cnt);


    }
    static void dfs (int y , int x, int[][] arr , boolean[][] visit) {


        for(int i = 0 ; i < 4; i++){
            int a = x + X[i];
            int b = y + Y[i];

            if(a < 0 || b < 0 || a >= N || b >= M){
                continue;
            }
            if(!visit[b][a]){
                if(arr[b][a] == 15){
                    cnt++;
                }
                visit[b][a] = true;
                dfs(b,a,arr,visit);
            }
        }


    }

}
