import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String [][] arr =new String[n][2];



        for(int i=0;i<n;i++){
                String str = sc.nextLine();
                String [] str1 = str.split(" ");
                arr[i][0] = str1[0];
                arr[i][1] = str1[1];

        }

        Arrays.sort(arr, (o1,o2) -> {
            int compareFirst = Integer.parseInt(o1[0]) - (Integer.parseInt(o2[0]));

            return compareFirst;
        });


        for(int i=0; i<n;i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        sc.close();
    }
}
