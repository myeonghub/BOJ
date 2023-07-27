
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int p =in.nextInt();
    for(int i=0;i<p;i++){
        int n = in.nextInt();
        String h[] =in.next().split("");
        for(int j=0;j<=h.length-1;j++){
            for(int l=0;l<n;l++){
                sb.append(h[j]);
            }
        }
        sb.append("\n");
        

    }
    in.close();
    System.out.println(sb);
    

    

    
}

}