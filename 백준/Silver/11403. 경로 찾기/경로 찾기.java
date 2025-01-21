import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int [][] arr= new int[n][n];
        boolean [][] go = new boolean[n][n];


        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //플로이드 와샬 알고리즘 !! 굉장히 중요함!!
        for(int k = 0; k<n;k++){
            for(int i = 0; i<n;i++){
                for(int j = 0; j<n;j++){
                    if(arr[i][k] == 1 && arr[k][j]==1){
                        arr[i][j]=1;
                    }
                }
            }
        }

        for(int k = 0; k<n;k++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[k][i] + " ");
            }
            System.out.println();
        }








    }
}
