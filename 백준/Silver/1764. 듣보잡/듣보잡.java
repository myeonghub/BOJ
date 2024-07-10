import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(st.nextToken());

        String [] str = new String[n];

        String [] str2 = new String[k];

        for(int i=0;i<n;i++){
            str[i] = br.readLine();
        }

        for(int i=0;i<k;i++){
            str2[i] = br.readLine();
        }

        int count =0;
        Arrays.sort(str);
        Arrays.sort(str2);



        for(int i=0;i<k;i++){
            if(Arrays.binarySearch(str,str2[i]) >=0){
                sb.append(str2[i]).append("\n");
                count++;
            }

        }


        System.out.println(count + "\n" + sb);

    }

}
