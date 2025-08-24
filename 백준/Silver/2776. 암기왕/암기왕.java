import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
    static int m , k;
    static Long x , y;
    static int cnt;

    static int paint;
    static int area;



    static int[] X = {0,0,-1,1};
    static int[] Y = {1,-1,0,0};



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int q = 0 ; q < c; q++) {
            n = Integer.parseInt(br.readLine());


            int[] a = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }

            k = Integer.parseInt(br.readLine());
            int[] b = new int[k];
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < k; i++){
                b[i] = Integer.parseInt(st.nextToken());
            }



            Arrays.sort(a);

            for(int i = 0; i < k; i++) {
                int start = 0;
                int end = a.length - 1;
                boolean chk = true;
                while (start <= end){
                    int mid = (start + end)/2;
                    if(a[mid] == b[i]){
                        sb.append(1 + "\n");
                        chk = false;
                        break;
                    }
                    else if(a[mid] < b[i]){
                        start = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }
                if(chk){
                    sb.append(0 + "\n");
                }
            }
            

        }
        System.out.println(sb);
    }
}

