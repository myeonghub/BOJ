import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    int k[][]= new int[N][M];
    int h[][]= new int[N][M];
    int g[][]= new int[N][M];
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            k[i][j]=in.nextInt();
            
            
        }
    }
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            h[i][j]=in.nextInt();
            
            
        }
    }
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            g[i][j]=k[i][j]+h[i][j];
            System.out.print(g[i][j]+" ");
            
        }
        System.out.print("\n");
        
    }
    


    
}

}