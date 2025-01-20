import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int k, a, b;

    static int[] dx = {1, 2, -1, -2, -1, -2, 1, 2};
    static int[] dy = {2, 1, 2, 1, -2, -1, -2, -1};
    static int[] sx = {-1, 1, 0, 0};
    static int[] sy = {0, 0, 1, -1};

    static int[][] arr;
    static boolean[][][] chk;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        b = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());

        arr = new int[a][b];

        chk = new boolean[k + 1][a][b];

        for (int i = 0; i < a; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++) {
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }


        int result = bfs(0, 0);
        System.out.println( result);
    }

    public static int bfs(int n, int m) {
        ArrayDeque<Node> que = new ArrayDeque<>();
        int c = 0;
        int d = 0;

        chk[0][n][m] = true;
        que.add(new Node(c, n, m, d));
        Node tmp;

        while (!que.isEmpty()) {
            tmp = que.poll();

            if (tmp.x == a - 1 && tmp.y == b - 1) {
                return tmp.d;
            }

            boolean check = false;
            if (tmp.c < k) {
                for (int i = 0; i < 8; i++) {
                    int x = dx[i] + tmp.x;
                    int y = dy[i] + tmp.y;

                    if (x < 0 || y < 0 || x >= a || y >= b) {
                        continue;
                    }

                    if (arr[x][y] == 0 && !chk[tmp.c + 1][x][y]) {
                        chk[tmp.c + 1][x][y] = true;
                        que.add(new Node(tmp.c + 1, x, y, tmp.d + 1));
//                        check = true;
                    }
                }

            }
//            if (check) {
//                continue;
//            }
            for (int i = 0; i < 4; i++) {
                int x = sx[i] + tmp.x;
                int y = sy[i] + tmp.y;

                if (x < 0 || y < 0 || x >= a || y >= b) {
                    continue;
                }
                if (arr[x][y] == 0 && !chk[tmp.c][x][y]) {
                    chk[tmp.c][x][y] = true;
                    que.add(new Node(tmp.c, x, y, tmp.d + 1));
                }
            }
        }
        return -1;

    }


    public static class Node {
        int c;
        int x;
        int y;
        int d;

        Node(int c, int x, int y, int d) {
            this.c = c;
            this.x = x;
            this.y = y;
            this.d = d;


        }
    }
}
