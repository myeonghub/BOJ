import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        double sum = 0;
        int[] arr = new int [n];

        for(int i= 0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum +=arr[i];

        }
        Arrays.sort(arr);

        int max =-1;
        int mod =arr[0];
        int count =0;
        boolean check = false;
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                count ++;
            }
            else{
                count = 0;
            }

            if(max <count){
                max = count;
                mod = arr[i];
                check = true;
            }
            else if(max == count && check){
                mod = arr[i];
                check = false;
            }

        }



        sb.append(Math.round(sum/n)+"\n");
        sb.append(arr[n/2]+"\n");
        sb.append(mod+"\n");
        sb.append(Math.abs(arr[n-1] - arr[0]));
        System.out.println(sb);




    }
}
