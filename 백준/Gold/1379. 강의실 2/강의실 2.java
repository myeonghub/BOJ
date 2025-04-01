import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        List<Gangui> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            list.add(new Gangui(g, s, e));
        }

        list.sort(Comparator.comparingInt(l -> l.s));

        int[] arr = solution(N, list);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    static int[] solution(int N, List<Gangui> list) {
        int[] arr = new int[N + 1];

        PriorityQueue<Room> roomQueue = new PriorityQueue<>(Comparator.comparingInt(r -> r.e));

        PriorityQueue<Integer> reque = new PriorityQueue<>();

        int cnt = 0;

        for (Gangui lec : list) {
            while (!roomQueue.isEmpty() && roomQueue.peek().e <= lec.s) {
                reque.add(roomQueue.poll().g);
            }

            int a;

            if (!reque.isEmpty()) {
                a = reque.poll();
            } else {
                a = ++cnt;
            }

            arr[lec.g] = a;
            roomQueue.add(new Room(lec.e, a));
        }

        arr[0] = cnt;
        return arr;
    }

    static class Gangui {
        int g;
        int s;
        int e;

        Gangui(int g, int s, int e) {
            this.g = g;
            this.s = s;
            this.e = e;
        }

        public int getE() {
            return e;
        }
    }

    static class Room {
        int e;
        int g;

        Room(int e, int g) {
            this.e = e;
            this.g = g;
        }
    }
}
