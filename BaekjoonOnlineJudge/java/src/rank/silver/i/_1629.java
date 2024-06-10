package rank.silver.i;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1629 {
    public static void main(String[] args) throws Exception {
        new _1629().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrSplit = br.readLine().split(" ");

        int a = Integer.parseInt(inputStrSplit[0]); 
        int b = Integer.parseInt(inputStrSplit[1]); // 지수
        int c = Integer.parseInt(inputStrSplit[2]);

        System.out.println(getRemainder(a, b, c));
    }

    private int getRemainder(int base, int exponent, int div) {
        if (exponent == 0) {
            return 1;
        }

        long half = getRemainder(base, exponent / 2, div);
        half = (half * half) % div;

        if (exponent % 2 != 0) {
            half = (half * base) % div;
        }

        return (int) half;
    }
}