
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int k[][]= new int[9][9];
    int max=0;
    int n=0;
    int m=0;
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            k[i][j]=in.nextInt();
            if(k[i][j]>=max){
                max=k[i][j];
                n=i+1;
                m=j+1;
            }
        }
    }
    System.out.println(max);
    System.out.println(n+" "+m);
    
    
    


    
}

}