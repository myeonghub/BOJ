import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(N,arr);
    }

    static void solution(int N,int[] arr){
        Stack<Integer> stk = new Stack<>();
        StringBuffer sb = new StringBuffer();

        int[] arr2 = new int[N];
        stk.push(0);
        for(int i = 1; i < N; i++){
            while(!stk.isEmpty() && arr[stk.peek()] < arr[i]){
                arr2[stk.pop()] = arr[i];
            }
            stk.push(i);
        }
        while (!stk.isEmpty()){
            arr2[stk.pop()] = -1;
        }
        for(int i = 0; i < N; i++){
            sb.append(arr2[i] + " ");
        }
        System.out.println(sb);

    }
}
