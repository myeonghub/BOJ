import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();


        String str = br.readLine();
        char first = str.charAt(0);
        int count =0;

        for(int i =1;i<str.length();i++){
            count++;
            if(first != str.charAt(i)) {
                if (first =='0') {
                    zero.add(count);
                } else {
                    one.add(count);
                }
                first=str.charAt(i);
                count =1;
            }
            if(i == str.length()-1){
                if (first =='0') {
                    zero.add(count);
                } else {
                    one.add(count);
                }
            }
        }

        if(one.size() > zero.size()){
            System.out.println(zero.size());
        }
        else {
            System.out.println(one.size());
        }
    }
}
