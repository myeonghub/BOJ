
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner gugu = new Scanner(System.in);
        int N = gugu.nextInt();

        for(int i=1;i<10;i++){
            int k=N*i;
            System.out.printf("%d * %d = %d\n",N,i,k);
        }


    }
    
}