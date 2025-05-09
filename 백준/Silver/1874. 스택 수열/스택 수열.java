import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];
        boolean[] chk = new boolean[N+1];
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());

        }

        solution(N,arr,chk);
    }

    static void solution(int N, int[] arr, boolean[] chk){
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stk = new Stack();

        int num = 1;
        for(int i = 1; i <= N; i++){
            int tmp = arr[i];

            if(tmp >= num){
            while(tmp >= num){
                    stk.push(num++);
                    sb.append("+" + "\n");
                }
            }

            if(stk.get(stk.size()-1).equals(tmp)){
                sb.append("-" + "\n");
                stk.remove(stk.size()-1);

            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}

