import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0;i<n;i++){
            String str = br.readLine();
            boolean check = true;
            int[] arr = new int[26];
            for(int j =0; j<str.length();j++){
                if(arr[str.charAt(j) - 'a'] == 1){
                    if(str.charAt(j-1) != str.charAt(j)){
                        check = false;
                    }
                }
                else {
                    arr[str.charAt(j) - 'a'] =1;
                }
            }
            if(check){
                count++;
            }
        }

        System.out.println(count);

    }
}

