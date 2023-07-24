
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int[] K;
    K = new int[9];
    int max=0;
    int t=0;
    for(int i=0;i<9;i++){
        K[i] = in.nextInt();//int로 받을시 줄바꿈하여 입력받아도 문제가 되지 않음
        if(K[i]>max){
            t=i+1;
            max=K[i];

            
        }
    }
    sb.append(max).append("\n").append(t);
    System.out.println(sb);

    in.close();

    

    
}

}