import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[][] check;
    static int a,b,count;
    static int[] nx = {1,1,1,0,-1,-1,-1,0};
    static int[] ny = {-1,0,1,1,1,0,-1,-1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0){
                break;
            }
            arr = new int[b][a];
            check = new boolean[b][a];


            for(int i=0;i<b;i++){
                StringTokenizer st2= new StringTokenizer(br.readLine());
                for(int j=0;j<a;j++){
                    arr[i][j] = Integer.parseInt(st2.nextToken());

                }
            }

            for(int i=0;i<b;i++){
                for(int j=0;j<a;j++){
                    if(arr[i][j] ==1 && !check[i][j]){
                        count++;
                        bfs(i,j);
                    }
                }
            }

            sb.append(count + "\n");

            count =0;
        }
        System.out.println(sb);

    }

    public static void bfs(int y, int x){
        Queue<int [] > que = new LinkedList();
        int qx,qy = 0;
        que.add(new int[]{y,x});
        check[y][x] =true;
        int[] tmp = new int[2];
        while (!que.isEmpty()){
            tmp = que.poll();
            for(int i=0;i<8;i++){
                qx = tmp[1] + nx[i];
                qy = tmp[0] + ny[i];

                if(qx<0||qy<0|| qx>=a || qy>=b){
                    continue;
                }
                if(arr[qy][qx] ==1 && !check[qy][qx]){
                    check[qy][qx] = true;
                    que.add(new int[]{qy,qx});
                }
            }
        }
    }
}
