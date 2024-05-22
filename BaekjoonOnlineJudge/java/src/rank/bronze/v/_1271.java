package rank.bronze.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1271 {
    public static void main(String[] args) throws Exception {
        new _1271().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 받기
        String[] inputStrSplit = br.readLine().split(" ");
        BigInteger n = new BigInteger(inputStrSplit[0]); // 조교가 가진 돈 n
        BigInteger m = new BigInteger(inputStrSplit[1]); // 돈을 받으러 온 생명체

        // 나누기와 나머지 연산
        BigInteger quotient = n.divide(m);
        BigInteger remainder = n.remainder(m);

        // 결과를 StringBuilder에 추가
        sb.append(quotient).append('\n');
        sb.append(remainder).append('\n');

        // 결과 출력
        System.out.println(sb);
    }
}