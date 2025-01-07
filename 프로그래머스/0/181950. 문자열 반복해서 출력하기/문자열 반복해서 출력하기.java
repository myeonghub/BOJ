import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str = st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        
        System.out.println(str.repeat(a));
    }
}