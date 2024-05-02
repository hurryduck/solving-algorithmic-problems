package step.by.step._math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _4948 {
    public static void main(String[] args) throws Exception {
        new _4948().solution();
    } 

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int n = Integer.valueOf(br.readLine());
            if (n == 0) {
                break;
            }

            int count = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (isPrimeNum(i)) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
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