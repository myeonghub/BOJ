import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static  final int INF = (int) 1e9;
    static int n ;
    static int m ;
    static int k ;
    static int x ;
    static int[] dis;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
         k = Integer.parseInt(st.nextToken());
         x = Integer.parseInt(st.nextToken());


        for(int i=0;i<n+1;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st1.nextToken());
            int s = Integer.parseInt(st1.nextToken());
            graph.get(f).add(s);
        }

        dis = new int[n+1];
        Arrays.fill(dis,INF); //모든 경로 노드값을 무한대로

        dis[x]=0;
        bfs(x);
        boolean check =false;
        for(int i=0;i<n+1;i++){
            if(dis[i] ==k){
                System.out.println(i);
                check= true;
            }
        }
        if(!check){
            System.out.println(-1);
        }



       

    }
    public static void bfs(int start){
        Queue<Integer> que = new LinkedList();
        que.add(start);

        while(!que.isEmpty()){
            int now = que.poll();
            int distance = 1;
            for(int i=0;i<graph.get(now).size();i++){
                int cost = dis[now] + distance;
                if(cost<dis[graph.get(now).get(i)]){
                    dis[graph.get(now).get(i)] = cost;
                    que.add(graph.get(now).get(i));
                }
            }
        }
    }
}
