import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int [] arr = {25,10,5,1};



        int n = Integer.parseInt(br.readLine());

        int [][] change = new int[n][4];



        for(int i=0;i<n;i++){
            int k = Integer.parseInt(br.readLine());
            if(k/arr[0] >0){
                change[i][0] = (k/arr[0]);
                k = k - (change[i][0]*arr[0]);
            }
            if(k/arr[1] >0){
                change[i][1] = (k/arr[1]);
                k -= (change[i][1]*arr[1]);
            }
            if(k/arr[2] >0){
                change[i][2] = (k/arr[2]);
                k -= (change[i][2]*arr[2]);
            }
            if(k/arr[3]>0){
                change[i][3] = (k/arr[3]);
            }
        }




        for(int i=0;i<n;i++){
            System.out.print(change[i][0] +" ");
            System.out.print(change[i][1] +" ");
            System.out.print(change[i][2] +" ");
            System.out.println(change[i][3]);
        }

    }
}
