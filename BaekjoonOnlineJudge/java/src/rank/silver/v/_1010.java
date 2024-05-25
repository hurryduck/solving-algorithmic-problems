package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1010 {
    public static void main(String[] args) throws Exception {
        new _1010().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Combination combi = new Combination(29);
        int t = Integer.valueOf(br.readLine()); // 테스트 케이스

        for (int i = 0; i < t; i++) {
            String[] inputStrSplit = br.readLine().split(" ");
            int n = Integer.valueOf(inputStrSplit[0]);
            int m = Integer.valueOf(inputStrSplit[1]);
    
            sb.append(combi.get(m, n)).append('\n');
        }
        
        System.out.println(sb);
    }

    private class Combination {
        /*
         * 조합: 서로 다른 n개에서 r개를 선택한다.
         * nCr: n! / ((n - r)! * r!)
         * - 1번 성질: n+1Cr+1 = nCr + nCr+1
         * - 2번 성질: nC0 == nCn == 1
         * 1번, 2번 성질을 활용하여 조합을 구한다.
         */
        int[][] matrix; // 메모제이션

        public Combination(int size) { // size: 최대 입력값 29
            this.matrix = new int[size + 1][size + 1]; // int[30][30]
        }
        
        public int get(int n, int r) {
            if (this.matrix != null && this.matrix[n][r] > 0) { // 메모제이션
                return matrix[n][r];
            }

            if (n == r || r == 0) { // 2번 성질
                return matrix[n][r] = 1;
            }

            return matrix[n][r] = get(n - 1, r - 1) + get(n - 1, r); // 1번 성질
        }
    }
}
