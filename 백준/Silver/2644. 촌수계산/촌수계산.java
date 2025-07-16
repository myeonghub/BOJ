import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());


        boolean[][] visit = new boolean[a+1][a+1];

        for(int i = 0; i < c; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            visit[p][q] = visit[q][p] = true;
        }
        int res = solution(a,visit);
        System.out.println(res);
    }
    static int solution (int a, boolean[][] visit) {
        Queue<int []> que = new LinkedList<int []>();

        int cnt = 0;
        que.add(new int[] {N,cnt});
        int[] arr = new int[2];
        boolean chk = false;

        while(!que.isEmpty()){
            arr = que.poll();
            int k = arr[0];
            cnt = arr[1];
            for(int i = 1; i <= a; i++){
                if(visit[k][i]){
                    if(i == M){
                        chk = true;
                        cnt+=1;
                        break;
                    }
                    que.add(new int[] {i,cnt+1});
                    visit[k][i] = visit[i][k] = false;
                }
            }

            if(chk) {
                break;
            }
        }

        if(chk) {
            return cnt;
        }
        else{
            return -1;
        }
    }
}
