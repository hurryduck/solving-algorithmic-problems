package rank.bronze.iv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2440 {
    public static void main(String[] args) throws Exception {
        new _2440().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
