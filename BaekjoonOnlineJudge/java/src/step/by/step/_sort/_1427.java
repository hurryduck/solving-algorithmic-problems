package step.by.step._sort;

import java.io.*;
import java.util.*;;

public class _1427 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();

        Character[] charArr = new Character[n.length()];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = n.charAt(i);
        }

        Arrays.sort(charArr, Collections.reverseOrder());

        for (char aChar : charArr) {
            bw.write(String.valueOf(aChar));
        }
        bw.flush();
    }

    public static void main(String[] args) throws Exception {
        new _1427().solution();
    }
}
