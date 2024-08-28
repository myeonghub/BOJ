import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer sb = new StringBuffer();

        while(true){
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }

            Stack<Character> stk = new Stack<>();
            boolean isBalanced = true;
            for(int i = 0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch== '(' || ch =='['){
                    stk.push(ch);
                }
                else if(ch == ')'){
                    if(stk.isEmpty()||stk.peek() != '(' ){
                        isBalanced = false;
                        break;
                    }
                    else {
                        stk.pop();
                    }
                }
                else if(ch == ']'){
                    if(stk.isEmpty()||stk.peek() != '[' ){
                        isBalanced = false;
                        break;
                    }
                    else {
                        stk.pop();
                    }
                }
            }
            if(isBalanced && stk.isEmpty()){
                sb.append("yes" + "\n");
            }
            else {
                sb.append("no" + "\n");
            }
        }

        System.out.println(sb);
    }
}
