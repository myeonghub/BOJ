import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;

    static int[] X = {1,0};
    static int[] Y = {0,1};
    static boolean chk = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(st.nextToken());

        if(N ==0 && M == 0){
            System.out.println("Yes");
        }

        int[][] arr = new int[M][N];
        boolean[][] visit = new boolean[M][N];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0,0,arr,visit);
        if(chk){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    static void solution (int b ,int a , int[][] arr , boolean[][] visit){
        if(a == N - 1 && b == M - 1 ){
            chk = true;
            return;
        }

        for (int i = 0; i < 2; i++) {
            int A = a + X[i];
            int B = b + Y[i];
            if(A < 0 || B < 0 || A >= N || B >= M){
                continue;
            }
            if (arr[B][A] == 1 && !visit[B][A]) {
                visit[B][A] = true;
                solution(B, A, arr, visit);
            }
        }

    }
}
