import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int total = 0;
        int arr[] = new int[n];


        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int o=n-1; o>=0; o--){
            if(k/arr[o] > 0){
                total += (k/arr[o]);
                k=(k%arr[o]);
            }
        }
        System.out.println(total);
    }
}