import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] miro;
    static boolean[][] check;

    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};

    static ArrayList<Integer> list = new ArrayList<>();
    static int nx, ny, n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        miro = new int[n][n];
        check = new boolean[n][n];

        // 입력을 처리하는 부분 수정
        for (int i = 0; i < n; i++) {
            String line = br.readLine();  // 각 줄을 읽어서
            for (int j = 0; j < n; j++) {
                miro[i][j] = line.charAt(j) - '0';  // 한 글자씩 숫자로 변환
            }
        }

        // 단지 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (miro[i][j] == 1 && !check[i][j]) {
                    bfs(i, j);  // 1인 곳에서 BFS 시작
                }
            }
        }

        // 결과 출력
        Collections.sort(list);  // 단지 크기를 오름차순 정렬
        System.out.println(list.size());  // 총 단지 수 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));  // 각 단지 크기 출력
        }
    }

    // BFS 구현
    public static void bfs(int y, int x) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{y, x});

        check[y][x] = true;
        int sum = 0;

        while (!que.isEmpty()) {
            int[] tmp = que.poll();
            int qy = tmp[0];
            int qx = tmp[1];

            sum++;

            for (int i = 0; i < 4; i++) {
                nx = qy + dy[i];
                ny = qx + dx[i];

                // 경계 체크 및 방문 여부 확인
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if (!check[nx][ny] && miro[nx][ny] == 1) {
                    check[nx][ny] = true;
                    que.add(new int[]{nx, ny});
                }
            }
        }

        list.add(sum);  // 해당 단지의 집 개수 기록
    }
}
