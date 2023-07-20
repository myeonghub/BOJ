
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner gugu = new Scanner(System.in);
        int N = gugu.nextInt();
        gugu.close();

        for(int i=1;i<N+1;i++){
            for(int j=0;j<i;j++){
            System.out.print("*");

            }
            System.out.print("\n");
            
        }


    }
    
}
