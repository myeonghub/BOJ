import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Queue<Long> queue = new LinkedList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        StringTokenizer st = new StringTokenizer(br.readLine());

        Long n = Long.parseLong(st.nextToken());
        Long k = Long.parseLong(st.nextToken());

        int result = bfs(n,k);

        System.out.println(result);
    }

    public static int bfs(Long n , Long k){
        queue.add(n*2);
        queue.add(n*10+1);
        int cnt =0;

        while (!queue.isEmpty()){
            cnt++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                long now = queue.poll();
                if(now >k){
                    continue;
                }
                if(now == k){
                    return (cnt+1);
                }
                queue.add(now*2);
                queue.add(now*10+1);
            }

        }
        return -1;
    }
}
