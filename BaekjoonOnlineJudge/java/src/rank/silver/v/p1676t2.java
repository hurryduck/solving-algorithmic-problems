package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1676t2 {
    public static void main(String[] args) throws Exception {
        new p1676t2().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int fiveCount = 0;

        // n!에서 5의 배수들을 모두 센다.
        for (int i = 5; i <= n; i *= 5) {
            fiveCount += n / i;
        }

        System.out.println(fiveCount);
    }
}
