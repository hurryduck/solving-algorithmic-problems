package rank.bronze.ii;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1075 {
    public static void main(String[] args) throws Exception {
        new _1075().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine()); // 큰 정수
        int f = Integer.valueOf(br.readLine()); // 작은 정수

        int num = (n / 100) * 100;
        while (num % f != 0) {
            num++;
        }
        int remainder = num % 100;
        System.out.println(remainder < 10 ? "0" + remainder : remainder);
    }
}
