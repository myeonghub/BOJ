import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        

        for(int i =0;i<n;i++){
            int k = Integer.parseInt(br.readLine());

            int [] arr = new int[k+1];

            for(int j =0;j<k; j++){
                StringTokenizer st = new StringTokenizer(br.readLine().trim());

                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());

                arr[first] = second;
            }

            int pivot = arr[1];
            int count =0;

            for(int h=2;h<arr.length;h++){
                if(arr[h]<pivot){
                    pivot = arr[h];
                    count++;
                }
            }
            System.out.println(count+1);

        }

    }
}
