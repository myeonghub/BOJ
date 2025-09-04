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




    static int[] X = {0,0,-1,1};
    static int[] Y = {1,-1,0,0};

    static List<Long>  list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        if(n <= 10 ){
            System.out.println(n);
            return;
        }
        else if(n >= 1023){
            System.out.println(-1);
            return;
        }
        for(int i = 0 ; i < 10; i++){
            solution(i);
        }
        Collections.sort(list);
        System.out.println(list.get(n));

    }
    static void solution(long n){
        list.add(n);
        long num = n % 10;
        if(num == 0){
            return ;
        }
        for(long i = num - 1; i >= 0 ; i--){
            long tmp = n * 10 + i;
            solution(tmp);
        }
    }



}

