package step.by.step._math;

import java.io.*;

public class _1934 {
    public static void main(String[] args) throws Exception {
        new _1934().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int T = Integer.valueOf(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] inputStrSplit = br.readLine().split(" ");
            int a = Integer.valueOf(inputStrSplit[0]);
            int b = Integer.valueOf(inputStrSplit[1]);

            bw.write(String.valueOf(getSmallestCommonMultiple(a, b)));
            bw.newLine();
        }
        bw.flush();
    }

    private int getSmallestCommonMultiple(int a, int b) {
        int smallestCommonMultiple = 1;
        int div = 2;
        while (div <= a && div <= b) {
            if (a % div == 0 && b % div == 0) {
                smallestCommonMultiple *= div;
                a /= div;
                b /= div;
            }
            else {
                div++;
            }
        }
        smallestCommonMultiple *= a * b;
        return smallestCommonMultiple;
    }
}