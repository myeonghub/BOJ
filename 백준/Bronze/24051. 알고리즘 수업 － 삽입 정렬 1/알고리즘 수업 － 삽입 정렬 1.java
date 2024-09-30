import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 0;

        int[] arr = new int[a];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        for(int i = 1; i < a; i++){
            int key = arr[i];
            int j = i - 1;
            boolean moved = false; // 요소가 이동되었는지 여부

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                count++;
                moved = true;
                if(count == b){
                    System.out.println(arr[j]);
                    return;
                }
                j--;
            }

            if(moved){
                arr[j + 1] = key;
                count++;
                if(count == b){
                    System.out.println(key);
                    return;
                }
            }

        }
        System.out.println(-1);
    }
}
