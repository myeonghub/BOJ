import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<n;i++) {
            int find = arr[i];

            int start = 0;
            int end = n-1;


            while(start<end){
                if(find == arr[start] + arr[end]){
                    if(start != i && end !=i){
                        count ++;
                        break;
                    }
                    else if(start == i){
                        start++;
                    }
                    else if(end == i){
                        end--;
                    }
                }
                else if(find >arr[start] + arr[end]){
                    start++;
                }
                else{
                    end--;
                }

            }
        }



        System.out.println(count);
    }
}

