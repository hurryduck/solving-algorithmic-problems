package rank.bronze.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _2338 {
    public static void main(String[] args) throws Exception {
        new _2338().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());


        sb.append(a.add(b)).append("\n");
        sb.append(a.subtract(b)).append("\n");
        sb.append(a.multiply(b)).append("\n");

        System.out.println(sb);
    }
}
