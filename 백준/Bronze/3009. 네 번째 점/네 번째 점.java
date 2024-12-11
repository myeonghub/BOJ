import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb =new StringBuilder();

        int [] h = new int [3];
        int [] w = new int [3];

        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            h[i] = Integer.parseInt(st.nextToken());
            w[i] = Integer.parseInt(st.nextToken());
        }

        if(h[0] == h[1]){
            h[0] =-1;
            h[1] =-1;
        }
        else if(h[0]==h[2]){
            h[0] =-1;
            h[2] =-1;
        }
        else if(h[1]==h[2]){
            h[1] =-1;
            h[2] =-1;
        }

        if(w[0] == w[1]){
            w[0] =-1;
            w[1] =-1;
        }
        else if(w[0]==w[2]){
            w[0] =-1;
            w[2] =-1;
        }
        else if(w[1]==w[2]){
            w[1] =-1;
            w[2] =-1;
        }

        for(int i=0;i<3;i++){
            if(h[i]!= -1){
                sb.append(h[i]);
            }
        }
        sb.append(" ");
        for(int i=0;i<3;i++){
            if(w[i]!= -1){
                sb.append(w[i]);
            }
        }
        System.out.println(sb);



    }
}


