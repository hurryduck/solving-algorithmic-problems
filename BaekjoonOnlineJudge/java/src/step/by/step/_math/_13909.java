package step.by.step._math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _13909 {
    public static void main(String[] args) throws Exception {
        new _13909().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        System.out.println((int) Math.sqrt(n));
    }
}
