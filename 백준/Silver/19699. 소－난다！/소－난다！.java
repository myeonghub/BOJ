import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int  n,m ;
    static int [] arr;
    static ArrayList<Integer> al = new ArrayList();

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuffer sb = new StringBuffer();

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());



            arr = new int[n];
            StringTokenizer st1= new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st1.nextToken());
            }

            isPrime(0,0,0);

            Collections.sort(al);

            for(int i : al){
                sb.append(i +" ");
            }
            System.out.print(sb);

            if(al.size() == 0){
                System.out.println(-1);
            }

        }
        static void isPrime(int x , int sum ,int cnt ){
            if(cnt == m) {
                for (int i = 2; i <= Math.sqrt(sum); i++) {
                    if (sum % i == 0) {
                        return;
                    }
                }
                if(!(al.contains(sum))) al.add(sum);
            }
            for(int i=x;i<n;i++){
                isPrime(i+1, sum + arr[i],cnt+1);
            }
        }
    }