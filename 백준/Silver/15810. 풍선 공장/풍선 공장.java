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


        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());



        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);


        long start = 0;
        long end = (long)a[0] * (long)m;


            while (start <= end){
                long mid = (start + end)/2;
                long count = 0;
                for(int i = 0; i < n; i++){
                    count += mid / a[i];
                }
                if(count >= m){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        System.out.println(start);

    }


}

