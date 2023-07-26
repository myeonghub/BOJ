
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String h = in.nextLine();
    StringTokenizer sh = new StringTokenizer(h," ");
    /*int[] k=new int[h.length];
    int p=0;
    for(int i=0;i<h.length;i++){
        if(h[i]==" "){
            p++;
        }
    }
    /*if(h[0]==" "){
            p--;

        }
        else if(h[h.length-1]==" "){
            p--;
        }/* */
    
    System.out.println(sh.countTokens());

    in.close();
    }
}