import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        Integer arr2[] = new Integer[n];
        long x = 0;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }



        long small = arr2[0];

        for (int o = 0; o < n - 1; o++) {
            if (small > arr2[o]) {
                small = arr2[o];

                x += (small * arr[o]);
            }
            else {
                x += (small * arr[o]);
            }
        }
        System.out.println(x);
    }
}