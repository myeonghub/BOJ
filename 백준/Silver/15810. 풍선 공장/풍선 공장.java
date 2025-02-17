import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
        static long n,m;
        public static void main(String[] args)throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
             n = Long.parseLong(st.nextToken());
             m = Long.parseLong(st.nextToken());


            long[] arr = new long[(int)n];

            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                arr[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(arr);
            long result = solution(arr);

            System.out.println(result +1 );

        }


        public static long solution(long[] arr){
            long start = 0;
            long end = arr[0] * m;

            while(start<=end){
                long mid = (start+end)/2;
                long cnt = pungsun(mid, arr);

                if(cnt<m){
                    start = mid +1;
                }
                else {
                    end = mid -1;
                }
            }

            return end;

        }


        public static  long  pungsun(long k , long[] arr){
            long sum =0;

            for(int i=0;i<n;i++){
                sum += (k /arr[i]);
            }
            return sum;
        }
    }

