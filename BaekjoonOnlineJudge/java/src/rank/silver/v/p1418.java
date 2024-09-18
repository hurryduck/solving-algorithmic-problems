package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1418 {
    public static void main(String[] args) throws Exception {
        new p1418().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // N
        int k = Integer.parseInt(br.readLine()); // K

        // K-세준수 세기
        int kSejunNumCount = 0;
        for (int i = 1; i <= n; i++) {
            if (isKSejunNum(i, k)) {
                kSejunNumCount++;
            }
        }

        System.out.println(kSejunNumCount);
    }

    // K-세준수 확인 메소드
    private boolean isKSejunNum(int num, int k) {
        // 소인수 중 최댓값 구하기
        int biggestPrimeFactor = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                biggestPrimeFactor = i;
                num /= i;
            }
        }
        if (num > 1) {
            biggestPrimeFactor = num;
        }

        return biggestPrimeFactor <= k;
    }
}