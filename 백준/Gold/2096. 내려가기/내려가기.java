import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//class Node implements Comparable<Node>{
//    int y;
//    int x;
//    int wall;
//
//    public Node(int y, int x, int wall) {
//        this.y = y;
//        this.x = x;
//        this.wall = wall;
//    }
//
//    @Override
//    public int compareTo(Node o) {
//        // 오름차순
//        return wall - o.wall;
//    }
//}
public class Main {
    static int n , p, q;
    static int m;
    static Long x , y;
    static int cnt;

    static int paint;
    static int area;



    static int[] X = {0,0,-1,1};
    static int[] Y = {1,-1,0,0};

    static HashMap<Long,Long> hash = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][3];



        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] Maxdp = new int[n][3];

        Maxdp[0][0] = arr[0][0];
        Maxdp[0][1] = arr[0][1];
        Maxdp[0][2] = arr[0][2];

        for(int i = 1; i < n; i++){
            for(int j = 0; j < 3; j++){
                if(j == 0){
                    Maxdp[i][j] = Math.max(Maxdp[i-1][j] , Maxdp[i-1][j+1]) + arr[i][j];
                }
                else if(j == 1){
                    Maxdp[i][j] = Math.max(Math.max(Maxdp[i-1][j] , Maxdp[i-1][j+1]),Maxdp[i-1][j-1]) + arr[i][j];
                }
                else{
                    Maxdp[i][j] = Math.max(Maxdp[i-1][j] , Maxdp[i-1][j-1]) + arr[i][j];
                }
            }
        }

        int[][] Mindp = new int[n][3];

        Mindp[0][0] = arr[0][0];
        Mindp[0][1] = arr[0][1];
        Mindp[0][2] = arr[0][2];

        for(int i = 1; i < n; i++){
            for(int j = 0; j < 3; j++){
                if(j == 0){
                    Mindp[i][j] = Math.min(Mindp[i-1][j] , Mindp[i-1][j+1]) + arr[i][j];
                }
                else if(j == 1){
                    Mindp[i][j] = Math.min(Math.min(Mindp[i-1][j] , Mindp[i-1][j+1]),Mindp[i-1][j-1]) + arr[i][j];
                }
                else{
                    Mindp[i][j] = Math.min(Mindp[i-1][j] , Mindp[i-1][j-1]) + arr[i][j];
                }
            }
        }

        System.out.print(Math.max(Math.max(Maxdp[n-1][0],Maxdp[n-1][1]),Maxdp[n-1][2]) + " ");

        System.out.print(Math.min(Math.min(Mindp[n-1][0],Mindp[n-1][1]),Mindp[n-1][2]));

    }
}

