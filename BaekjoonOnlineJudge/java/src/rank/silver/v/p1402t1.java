package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p1402t1 {
    public static void main(String[] args) throws Exception {
        new p1402t1().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] inputSplit = br.readLine().split(" ");
            long a  = Long.parseLong(inputSplit[0]);
            long b  = Long.parseLong(inputSplit[1]);

            // A가 주어지면 B로 변환 가능한지 확인
            if (canConvert(a, b)) {
                result.append("yes\n");
            } else {
                result.append("no\n");
            }
        }

        System.out.println(result.toString());
        br.close();
    }
    
    private boolean canConvert(long a, long b) {
        // a 소인수 분해
        List<Integer> primeFactorList = getPrimeFactorList(a);

        // 소인수를 조합해 가능한 b 집합
        Set<Long> canConvertSet = getCanConvertSet(primeFactorList);

        // b 집합 포함여부 확인
        return canConvertSet.contains(b);
    }

    // 소인수 분해
    private List<Integer> getPrimeFactorList(long num) {
        List<Integer> primeFactorList = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                primeFactorList.add(i);
                num /= i;
            }
        }
        if (num > 1) {
            primeFactorList.add((int) num);
        }
        return primeFactorList;
    }

    // 소인수를 조합해 가능한 b 집합
    private Set<Long> getCanConvertSet(List<Integer> primeFactorList) {
        Set<Long> canConvertSet = new HashSet<>();
        canConvertSet.add(1L); // 초기 값으로 1 추가 (곱셈 항등원)

        // 각 소인수의 모든 조합 계산
        for (int factor : primeFactorList) {
            Set<Long> newSet = new HashSet<>(canConvertSet);
            for (long value : canConvertSet) {
                newSet.add(value * factor);
            }
            canConvertSet = newSet;
        }
        return canConvertSet;
    }
}