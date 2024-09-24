import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int test = Integer.parseInt(br.readLine());

        for(int i =0;i<test;i++){
            int [] tongodd;
            int tc = Integer.parseInt(br.readLine());
            if(tc%2!=0){
                tongodd = new int[tc/2 +1];
            }
            else {
                tongodd = new int[tc/2];
            }
            int[] tong = new int[tc];
            int[] tongeven = new int[tc/2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<tc;j++){
                tong[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(tong);

            for(int k=0;k<tc;k+=2){
                tongodd[k/2] = tong[k];
            }
            for(int k=1;k<tc;k+=2){
                tongeven[k/2] = tong[k];
            }

            int max=0;

            for(int u=0;u<tongodd.length-1;u++){
                if(max< Math.abs(tongodd[u] - tongodd[u+1])){
                    max = Math.abs(tongodd[u] - tongodd[u+1]);
                }
            }
            if(max < Math.abs(tongodd[tongodd.length-1] - tongeven[tongeven.length-1])){
                max = Math.abs(tongodd[tongodd.length-1] - tongeven[tongeven.length-1]);
            }

            for(int u=0;u<tongeven.length-1;u++){
                if(max< Math.abs(tongeven[u] - tongeven[u+1])){
                    max = Math.abs(tongeven[u] - tongeven[u+1]);
                }
            }

            sb.append(max + " \n");


        }
        System.out.println(sb);
    }
}
