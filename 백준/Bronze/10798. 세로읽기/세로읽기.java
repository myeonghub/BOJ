
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
    BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    char[][] k=new char[5][15];
    int max=0;
    for(int i=0;i<5;i++){
        String y = sc.next();
        if(max < y.length()) max = y.length();
        for(int j=0;j<y.length();j++){
            k[i][j]=y.charAt(j);
        }
    }
    for(int i=0;i<max;i++){
        for(int j=0;j<5;j++){
            if(k[j][i]=='\0'){
                continue;
            }
            System.out.print(k[j][i]);

        }
    }
    System.out.print(sb);

    
    
    
    


    
}

}