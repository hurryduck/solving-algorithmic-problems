package step.by.step._math;

import java.io.*;

public class _17103 {
    public static void main(String[] args) throws Exception {
        new _17103().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.valueOf(br.readLine()); // 테스트 케이스

        for (int i = 0; i < t; i++) {
            int n = Integer.valueOf(br.readLine()); // 정수 n
            bw.write(String.valueOf(getNumberOfGoldbachPartitions(n)));
            bw.newLine();
        }
        bw.flush();
    }

    private int getNumberOfGoldbachPartitions(int num) {
        int count = 0;

        // 0부터 num까지의 배열을 생성하고 초기화
        boolean[] isNotPrime = new boolean[num + 1];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i <= num; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        // 골드바흐 파티션의 개수 세기
        for (int i = 2; i <= num / 2; i++) {
            if (!isNotPrime[i] && !isNotPrime[num - i]) {
                count++;
            }
        }

        return count;
    }
}
