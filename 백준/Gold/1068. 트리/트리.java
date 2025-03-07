import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int root =0;
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] ==-1){
                root = i;
            }
        }

        int erase = Integer.parseInt(br.readLine());

        if(root == erase){
            System.out.println(0);
            return;
        }

        solution(arr,erase,n);



        int cnt =0;
        int k =0;
        for(int i=0;i<n;i++){
            boolean chk = true;
            if(arr[i] != -1){
                k++;
                for(int j=0;j<n;j++){
                    if(arr[j] ==i){
                        chk = false;
                    }
                }
                if(chk){
                    cnt++;
                }
            }
        }
        if(k==0){
            cnt =1;
        }

        System.out.println(cnt);
    }


    static void solution(int[] arr, int erase , int n){
        Queue<Integer> que = new LinkedList<>();

        que.add(erase);

        while(!que.isEmpty()){
            int i = que.poll();
            arr[i] = -1;
            for(int j=0;j<n;j++){
                if(arr[j] ==i){
                    que.add(j);
                    arr[j] = -1;
                }
            }
        }


    }
}
