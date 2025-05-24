import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());


        Queue<Integer> que = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            que.add(i);
        }

        int res = 0;
        for(int i = 1; i <= N; i++){
            if(que.isEmpty()){
                break;
            }
            res = que.poll();
            que.add(que.poll());
        }

        System.out.println(res);


    }
}
