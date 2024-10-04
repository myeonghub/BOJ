import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int y =-1;

        for (int i = 0; i < n; i++) {
            arr.add(i+1);
        }
        while (!arr.isEmpty()) {
            for (int e = 0; e < k; e++) {
                if (y == arr.size()-1) {
                    y = 0;
                }
                else {
                    y++;
                }
            }
            arr2.add(arr.remove(y));
            y--;
        }
        System.out.print("<");
        for (int q = 0; q < n-1; q++) {
            System.out.print(arr2.get(q)+", ");
        }
        System.out.print(arr2.get(arr2.size()-1));
        System.out.println(">");
    }
}
