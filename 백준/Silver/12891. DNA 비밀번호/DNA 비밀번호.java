import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[] ch = {'A', 'C', 'G', 'T'};
    static char[] S;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        int[] DNA = new int[5];
        int[] chk = new int[5];
        S = new char[s + 1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            DNA[i] = Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i < s; i++) {
            S[i + 1] = str.charAt(i);
        }
        int cnt = 0;
        int start = 1;
        int end = p;
        // 초기 슬라이딩 윈도우 설정
        for (int k = 1; k <= p; k++) {
            chk[sliding(k)]++;
        }
        for (int i = p; i <= s; i++) {

            boolean bool = false;
            //윈도우 크기를 만족할때, 해당 DNA가 유효한지 판단
            if ((end - start) == p - 1) {
                for (int j = 0; j < 4; j++) {
                    if (DNA[j] > chk[j]) {
                        bool = true;
                    }
                }
                if (!bool) {
                    cnt++;
                }
                if (end == s) break; //end까지 진행시 break;

                //슬라이딩윈도우
                chk[sliding(++end)]++;

                chk[backsliding(start++)]--;
            } else if ((end - start) < p - 1) {
                chk[sliding(++end)]++;

            } else {
                chk[backsliding(start++)]--;
            }


        }
        System.out.println(cnt);
    }

    //각 문자열 배열 값 추가
    static int checkDNA(char a) {
        for (int i = 0; i < 4; i++) {
            if (a == ch[i]) {
                return i;
            }
        }
        return -1;
    }

    static int sliding(int a) {
        return checkDNA(S[a]);
    }

    static int backsliding(int a) {
        return checkDNA(S[a]);
    }
}
