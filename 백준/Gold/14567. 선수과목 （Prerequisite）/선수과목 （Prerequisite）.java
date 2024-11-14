import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());


            List<Integer>[] list = new ArrayList[N+1];
            int [] arr = new int[N+1];
            int [] in = new int[N+1];

            for(int i=1;i<N+1;i++){
                list[i] = new ArrayList<>();
            }
            for(int k=0;k<M;k++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int i =Integer.parseInt(st1.nextToken());
                int j =Integer.parseInt(st1.nextToken());

                list[i].add(j);
                in[j] ++;

            }

            for(int i=1;i<=N;i++){
                if(in[i] ==0) {
                    arr[i] = 1;
                }
            }

            for(int i=1; i<=N; i++){
                for(int j=0; j<list[i].size(); j++){
                    int node = list[i].get(j);
                    arr[node] = Math.max(arr[node], arr[i]+1);
                }
            }

            for(int i=1;i<N+1;i++){
                System.out.print(arr[i] + " ");
            }



        }
    }

