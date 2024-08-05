
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

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int temp =0;
        
        for(int i=0;i<k;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st1.nextToken());
            int second = Integer.parseInt(st1.nextToken()); 

            temp = arr[first-1];
            arr[first-1] = arr[second-1];
            arr[second-1] = temp;
 
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
        

        
    


        


    }
}