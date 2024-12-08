import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringBuilder sb =new StringBuilder();

            while(true) {
                int n = Integer.parseInt(br.readLine());

                ArrayList<Integer> arr = new ArrayList();

                int sum =0;
                if(n==-1){
                    break;
                }
                for(int i=1;i<=n/2;i++){
                    if(n%i==0){
                        arr.add(i);
                        sum+=i;
                    }
                }
                if(sum==n){
                    sb.append(n +" " + "=");
                    for(int i=0;i<arr.size();i++){
                        sb.append(" "+ arr.get(i)+" "+"+");
                    }
                    sb.delete(sb.length()-1,sb.length());
                }
                else{
                    sb.append(n+" is NOT perfect." );
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }


