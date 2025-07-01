import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        boolean[] visit = new boolean[N+1];

        solution(0,N,M,arr,visit);
    }
    static void solution (int k, int N ,int M , int[] arr , boolean[] visit){
        if(k == M){
            for(int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= N; i++){
            if(visit[i]){
                continue;
            }
            visit[i] = true;
            arr[k] = i;
            solution(k+1,N,M,arr,visit);
            visit[i] = false;
        }
    }
}
