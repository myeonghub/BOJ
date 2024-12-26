import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        char[] chr = new char[w];
        char[] chr2 = new char[s];
        int cnt =0;
        int crt =0;
        String str = br.readLine();
        String str1 = br.readLine();

        int uniqueChars=0;

        int[] wFreq = new int[52];
        int[] windowFreq = new int[52];

        int start = 0;

        for (char c : str.toCharArray()) {
            int index = charToIndex(c);
            if (wFreq[index] == 0) uniqueChars++; // 고유 문자를 발견하면 증가
            wFreq[index]++;
        }


        for (int end = 0; end < s; end++) {
                // 새로운 문자를 윈도우에 추가
                int addIndex = charToIndex(str1.charAt(end));
                windowFreq[addIndex]++;

                // 추가된 문자가 W의 빈도와 일치하면 matches 증가
                if (windowFreq[addIndex] == wFreq[addIndex]) {
                    cnt++;
                }

                // 윈도우 크기가 g를 초과하면 start 포인터 이동
                if (end - start + 1 > w) {
                    int removeIndex = charToIndex(str1.charAt(start));
                    if (windowFreq[removeIndex] == wFreq[removeIndex]) {
                        cnt--;
                    }
                    windowFreq[removeIndex]--;
                    start++;
                }
                if(cnt==uniqueChars){
                    crt++;
                }

        }

        System.out.println(crt);




    }
    private static int charToIndex(char c) {
        if (Character.isUpperCase(c)) {
            return c - 'A';
        } else {
            return c - 'a' + 26;
        }
    }
}
