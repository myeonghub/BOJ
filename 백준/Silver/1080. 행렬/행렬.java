import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int [][] arr = new int[n][k];
        int [][] arr2 = new int[n][k];

        int count = 0;

        for(int i = 0;i<n;i++){
            String str2 = br.readLine();
            for(int j = 0;j<k;j++){
                arr[i][j] = str2.charAt(j) - '0';
            }
        }

        for(int i = 0;i<n;i++){
            String str3 = br.readLine();
            for(int j = 0;j<k;j++){
                arr2[i][j] = str3.charAt(j) - '0';
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<k;j++){
                if(arr[i][j] != arr2[i][j] && i+2<n && j+2<k){
                    for(int a=i ; a<=i+2; a++){
                        for(int b=j ; b<=j+2; b++){
                            if(arr[a][b]==0){
                                arr[a][b] =1;
                            }
                            else {
                                arr[a][b] = 0;
                            }
                        }
                    }
                    count +=1;
                }
            }
        }


        for(int i =0 ;i<n;i++){
            for(int j = 0; j<k;j++){
                if(arr[i][j] != arr2[i][j]){
                    sb.append(-1);
                    System.out.println(sb);
                    return;
                }
            }
        }


        System.out.println(count);




    }
}
