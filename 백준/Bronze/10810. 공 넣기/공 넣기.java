
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int g = in.nextInt();
    int h = in.nextInt();
    int[] arr= new int[g];
    int i,j,k;
    for(int u=0;u<h;u++){
        i =in.nextInt();
        j =in.nextInt();
        k =in.nextInt();
    
    for(int c=i-1;c<j;c++){
        arr[c]=k;
        }
    }
    
    
    for(int q=0;q<arr.length;q++){
    System.out.print(arr[q]+ " ");
    }
    in.close();

    

    
}

}