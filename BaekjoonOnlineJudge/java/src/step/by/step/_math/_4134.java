package step.by.step._math;

import java.io.*;

public class _4134 {
    public static void main(String[] args) throws Exception {
        new _4134().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(getLPN(Long.valueOf(br.readLine()))));
            bw.newLine();
        }
        bw.flush();
    }

    // getLargestPrimeNumber: 주어진 범위에서 가장 큰 소수를 반환한다.
    private long getLPN(long startNum) {
        long num = startNum;
        while (true) { // 소수는 무한히 존재하기 때문 조건을 true로 사용해도 된다.
            if (isPrimeNum(num)) {
                return num;
            }
            num++;
        }
    }

    // isPrimeNum: 소수 여부 반환
    private boolean isPrimeNum(long num) {
        if (num < 2) { // 2보다 작은 소수는 없다.
            return false;
        }

        // 소수를 확인할 때에 약수 2승을 이상을 확인하는 것은 의미가 없다.
        for (long div = 2; div * div <= num; div++) { 
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }
}