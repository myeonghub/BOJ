import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int flag;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine().trim());

        flag = 0;
        int[] arr = new int[k];
        int[] arr2 = new int[k];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        insertionsort(arr, arr2, k);
        System.out.println(flag);
    }

    public static void insertionsort(int[] arr, int[] arr2, int k) {
        if (k <= 1) {
            return;
        }
        for (int i = 1; i < k; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            if (compareArray(arr, arr2, i + 1)) {
                flag = 1;
                return;
            }
        }
    }

    public static boolean compareArray(int[] A, int[] B, int size) {
        for (int i = 0; i < size; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }
}
