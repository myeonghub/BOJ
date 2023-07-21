import java.util.Scanner;

public class Main {
    
    public static int[] que;
    public static int s=0;
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        que = new int[N];

        for(int i=0;i<N;i++){
         String scan = scanner.next();

         switch (scan) {
             case "push":
                push(scanner.nextInt());
                break;
             case "pop":
                sb.append(pop()).append("\n");
                break;
             case "size" :
                sb.append(size()).append("\n");
                break;
             case "empty" :
                sb.append(empty()).append("\n");
                break;
             case "front" :
                sb.append(front()).append("\n");
                break;
             case "back" :
                sb.append(back()).append("\n");
                break;
            }
        }
        System.out.println(sb);
        scanner.close();
    }



    public static void push(int a){
        que[s]=a;
        s++;

       }
    public static int pop(){
       
        if(s==0){
            return -1;
        }
        else{
            int h = que[0];
            int tmp;

			for(int j = 1; j <= s; j++) {
				tmp = que[j];
				que[j - 1] = tmp;
				que[j] = 0;
				 			}
            s--;
            return h;
        }

        
    }
    public static int size(){
        return s;
       }
    public static int empty(){
        if(s==0){
            return 1;
        }
        else{
            return 0;
        }
       }
    public static int front(){
        if(s==0){
            return -1;
        }
        else{
            return que[0];
        }

       }
    public static int back(){
        if(s==0){
            return -1;
        }
        else{
            return que[s-1];
        }

    }
}
