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

    static int[] alpa = new int[26];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for(int i = 0 ; i < n ; i ++){
            str[i] = br.readLine();
            solution(str[i]);
        }

        Arrays.sort(alpa);

        int j = 9;
        int sum = 0;
        for(int i = 25; i >= 0; i--){
            sum += alpa[i] * j;
            j--;
        }

        System.out.println(sum);
    }
    static void solution(String str ) {
        char[] ch = str.toCharArray();
        int k = ch.length - 1;
        for(int i = 0 ; i < ch.length; i++){
            alpa[ch[i] - 'A'] += (int)Math.pow(10,k);
            k--;
        }

    }



}

