import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,a,b;
    static List<List<Integer>> arr;
    static int[] parent ;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int max = 100000;
        arr= new ArrayList<>();
        for(int i=0;i<n+1;i++){
            arr.add(new ArrayList<>());
        }
        visited = new boolean[max+1];
        for(int i=0;i<n-1;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a= Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());

            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        parent = new int[n+1];
        bfs(1);

        StringBuffer sb = new StringBuffer();
        for(int i =2;i<n+1;i++){
            sb.append(parent[i] + "\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int a){
        Queue<Integer> que = new LinkedList<>();

        que.add(a);
        visited[a] = true;

        while (!que.isEmpty()){
            int tmp = que.poll();
            for(int i : arr.get(tmp)){
                if(!visited[i]){
                    que.add(i);
                    parent[i] =tmp;
                    visited[i] = true;
                }
            }
        }
    }
}
