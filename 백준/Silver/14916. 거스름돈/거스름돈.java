import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        int fiveMax = n/5;

        for(int i=fiveMax;i>=0;i--) {
            int num = n - (5*i);
            if(num%2==0) {
                count = i;
                count += num/2;
                break;
            }
        }
        if(count==0) {
            count = -1;
        }
        System.out.println(count);

    }
}