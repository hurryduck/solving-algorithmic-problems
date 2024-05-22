package rank.bronze.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1247 {
    public static void main(String[] args) throws Exception {
        new _1247().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 3회
        for (int t = 0; t < 3; t++) {
            int n = Integer.valueOf(br.readLine()); // n개의 정수

            BigInteger result = new BigInteger("0");
            for (int i = 0; i < n; i++) {
                // 입력값 받기
                BigInteger input = new BigInteger(br.readLine());
                result = result.add(input);
            }

            switch (result.compareTo(BigInteger.ZERO)) {
                case 1:
                    sb.append("+").append('\n');
                    break;
                case 0:
                    sb.append("0").append('\n');
                    break;
                case -1:
                    sb.append("-").append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}
