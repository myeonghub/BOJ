import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static List<Long> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n <= 10) {
            System.out.println(n);
            return;
        } else if (n >= 1023) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < 10; i++) {
            solution(i);
        }
        Collections.sort(list);
        System.out.println(list.get(n));
    }

    static void solution(long n) { // 감소하는수를 만들어냄
        list.add(n);
        long num = n % 10;
        if (num == 0) {
            return;
        }
        for (long i = num - 1; i >= 0; i--) {
            long tmp = n * 10 + i;
            solution(tmp);
        }


    }

}
