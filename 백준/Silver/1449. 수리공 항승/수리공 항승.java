
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        int [] arr = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);


        int count = 0;
        int temp =0;

        for(int i=0;i<n;i++){
            if(arr[i]>temp){
                count ++;
                temp =arr[i];
                temp += k -1;
            }
        }

        System.out.println(count);
        

        
    


        


    }
}