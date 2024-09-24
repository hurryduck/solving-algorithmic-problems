package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1676t1 {
    public static void main(String[] args) throws Exception {
        new p1676t1().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int twoCount = 0;
        int fiveCount = 0;
        for (int num = 1; num <= n; num++) {
            int curNum = num;
            for (int i = 2; i <= Math.sqrt(curNum); i++) {
                while (curNum % i == 0) {
                    if (i == 2 || i == 5) {
                        twoCount += i == 2 ? 1 : 0;
                        fiveCount += i == 5 ? 1 : 0;
                    }
                    curNum /= i;
                }
            }
            if (curNum == 2 || curNum == 5) {
                twoCount += curNum == 2 ? 1 : 0;
                fiveCount += curNum == 5 ? 1 : 0;
            }
        }

        System.out.println(Math.min(twoCount, fiveCount));
    }
}
