import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        Integer arr2[] = new Integer[n];


        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());

        for(int o=0;o<n;o++){
            arr2[o]=arr[o]*(o+1);

        }

        Arrays.sort(arr2,Collections.reverseOrder());

        System.out.println(arr2[0]);
    }
}