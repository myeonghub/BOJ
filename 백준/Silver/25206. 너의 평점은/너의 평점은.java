import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double n = 0;
        double h = 0;
        for(int i =0;i<20;i++){
            String str = br.readLine();
            String[] st = str.split(" ");
            double k = Double.parseDouble(st[1]);
            h += k;
            if(st[2].equals("A+")){
                n += k*4.5;
            }
            else if(st[2].equals("A0")){
                n += k*4.0;
            }
            else if(st[2].equals("B+")){
                n += k*3.5;
            }
            else if(st[2].equals("B0")){
                n += k*3.0;
            }
            else if(st[2].equals("C+")){
                n += k*2.5;
            }
            else if(st[2].equals("C0")){
                n += k*2.0;
            }
            else if(st[2].equals("D+")){
                n += k*1.5;
            }
            else if(st[2].equals("D0")){
                n += k;
            }
            else if(st[2].equals("F")){
                n += k*0;
            }
            else {
                h-=k;
            }
        }
        double total = n/h;
        System.out.println(total);
    }
}
