import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int t=0;t<c;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Integer[] arr = new Integer [n];
            Queue<Integer> que = new LinkedList<>();
            Queue<Boolean> bool = new LinkedList<Boolean>();


            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int i =0;i<n;i++){
                arr[i] = Integer.parseInt(st1.nextToken());

                if(i==m)bool.add(true);
                else{  bool.add(false);}
                que.add(arr[i]);
            }

            Arrays.sort(arr, Collections.reverseOrder());
            int chk =0;
            int j =0;
            while(!que.isEmpty()){
                if(que.peek() != arr[j]){
                    que.add(que.poll());
                    bool.add(bool.poll());
                }
                else{
                    que.poll();
                    if(bool.poll()){
                        sb.append((chk+1)+"\n");
                        break;
                    }
                    j++;
                    chk++;
                }
            }
        }
        System.out.println(sb);
    }
}
