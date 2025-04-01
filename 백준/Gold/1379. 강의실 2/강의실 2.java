import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        List<Gangui> lectures = new ArrayList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            lectures.add(new Gangui(g, s, e));
        }

        lectures.sort(Comparator.comparingInt(l -> l.s));

        int[] arr = solution(N, lectures);

        for(int i : arr){
            System.out.println(i);
        }
    }

    static int[] solution(int N, List<Gangui> lectures){
        int[] arr = new int[N + 1];

        PriorityQueue<Room> roomQueue = new PriorityQueue<>(Comparator.comparingInt(r -> r.endTime));
        PriorityQueue<Integer> reusable = new PriorityQueue<>();

        int roomCount = 0;

        for (Gangui lec : lectures) {
            while (!roomQueue.isEmpty() && roomQueue.peek().endTime <= lec.s) {
                reusable.offer(roomQueue.poll().roomNum);
            }

            int assignedRoom;
            if (!reusable.isEmpty()) {
                assignedRoom = reusable.poll();
            } else {
                assignedRoom = ++roomCount;
            }

            arr[lec.g] = assignedRoom;
            roomQueue.offer(new Room(lec.e, assignedRoom));
        }

        arr[0] = roomCount;
        return arr;
    }

    static class Gangui{
        int g;
        int s;
        int e;

        Gangui(int g, int s, int e){
            this.g = g;
            this.s = s;
            this.e = e;
        }

        public int getE(){
            return e;
        }
    }

    static class Room {
        int endTime;
        int roomNum;

        Room(int endTime, int roomNum) {
            this.endTime = endTime;
            this.roomNum = roomNum;
        }
    }
}
