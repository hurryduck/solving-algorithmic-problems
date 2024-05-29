package rank.silver.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1003 {
    public static void main(String[] args) throws Exception {
        new _1003().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < n; i++) {
            sb.append(fibonacci.get(Integer.parseInt(br.readLine()))).append("\n");
        }

        System.out.println(sb);
    }

    private class Fibonacci {
        private class FibonacciNum {
            private int count0;
            private int count1;

            public FibonacciNum(int count0, int count1) {
                this.count0 = count0;
                this.count1 = count1;
            }

            public int getCount0() {
                return this.count0;
            }

            public int getCount1() {
                return this.count1;
            }

            public String toString() {
                return this.count0 + " " + this.count1;
            }
        }

        private FibonacciNum[] fibonacciNumArr = new FibonacciNum[41];

        public Fibonacci() {
            // 0과 1의 호출 횟수를 미리 계산해둡니다.
            fibonacciNumArr[0] = new FibonacciNum(1, 0); // fibonacci(0)
            fibonacciNumArr[1] = new FibonacciNum(0, 1); // fibonacci(1)

            for (int i = 2; i <= 40; i++) {
                int count0 = fibonacciNumArr[i - 1].getCount0() + fibonacciNumArr[i - 2].getCount0();
                int count1 = fibonacciNumArr[i - 1].getCount1() + fibonacciNumArr[i - 2].getCount1();
                fibonacciNumArr[i] = new FibonacciNum(count0, count1);
            }
        }

        public String get(int num) {
            return fibonacciNumArr[num].toString();
        }
    }
}
