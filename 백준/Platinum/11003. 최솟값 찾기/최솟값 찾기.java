import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        Deque<Node> arr = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            int k = Integer.parseInt(st.nextToken());
            solution(arr,i,k,M,sb);
        }

        System.out.println(sb);
    }

    static void solution(Deque<Node> arr, int i, int k, int M, StringBuffer sb){

        while(!arr.isEmpty() && arr.getLast().V > k){
            arr.removeLast();
        }
         arr.addLast(new Node(k,i));

         if(arr.getFirst().I <= i - M){
             arr.removeFirst();
         }

         sb.append(arr.getFirst().V + " ");


    }

    static class Node{
        public int V;
        public int I;

        Node(int V, int I){
            this.I = I;
            this.V = V;
        }
    }
}
