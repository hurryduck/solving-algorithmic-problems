package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1789 {
    public static void main(String[] args) throws Exception {
        new p1789().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long s = Long.parseLong(br.readLine());
        int n = 0;

        int curNum = 1;
        while (true) {
            n++;
            s -= curNum++;
            
            if (s < curNum) {
                break;
            }
        }

        System.out.println(n);
    }
}
