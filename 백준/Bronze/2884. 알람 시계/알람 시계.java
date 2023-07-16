import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int m = in.nextInt();
        
        if(m<45){
            m=m+15;
            h--;
            if(h<0){
                h=23;
            }
        }
        else{
            m =m-45;
        }
        
        System.out.println(h+" "+m);
        
    }
}