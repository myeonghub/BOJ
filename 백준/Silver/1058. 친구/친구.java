
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] count;
    static char[][] arr;
    static boolean[] check;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        count = new int[n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            check = new boolean[n];
            for (int j = 0; j < n; j++) {
                if(arr[i][j]=='Y'){
                    check[j] =true;
                    for(int k=0;k<n;k++){
                        if(arr[j][k]=='Y' && k!=i && !check[k]){
                            check[k] =true;
                        }
                    }
                }
            }
            for (boolean isFriend : check) {
                if (isFriend) {
                    count[i]++;
                }
            }
        }

        Arrays.sort(count);
        System.out.println(count[n-1]);


    }
}
