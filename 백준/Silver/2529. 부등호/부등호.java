import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static String [] arr;
    static boolean[] check = new boolean[10];
    static int k;
    static ArrayList array = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());
        arr = new String[k];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++){
            if(st.hasMoreTokens()) { // 다음 읽을 token이 있다면
                arr[i] = st.nextToken();
            }
        }


        for(int i =0 ; i<10; i++){
            check[i] = true; // 방문했음을 체크
            dfs(i,0,i + "");
        }

        System.out.println(array.get(array.size() -1));
        System.out.println(array.get(0));





    }
    public static void dfs(int number , int numIndex , String str) {
        if ( numIndex == k) {
            array.add(str);
        }
        else {
            for(int i= 0 ;i <=9 ; i++){
                if(!check[i]){
                    if(arr[numIndex].equals("<")){ // 작다 일때
                        if(number >= i){ // 현재의 값보다 크면 넘어감
                            continue;
                        }
                    }
                    else{
                        if(number <= i){ // 크다 일때 현재값 보다 작으면 넘어감
                            continue;
                        }
                    }
                    check[i] = true; // 방문했음을 체크
                    dfs(i,numIndex+1,str +i); //dfs를 다시 부름
                }
            }
        }
        check[number] = false;
    }
}
