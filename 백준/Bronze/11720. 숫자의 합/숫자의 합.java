
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int g = in.nextInt();
    String[] h = in.next().split("");
    int[] k=new int[h.length];
    int p=0;
    for(int i=0;i<h.length;i++){
        k[i]=Integer.parseInt(h[i]);
        p += k[i];
    }
    System.out.println(p);

    in.close();

    

    
}

}