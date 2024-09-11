package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1402t2 {
    public static void main(String[] args) throws Exception {
        new p1402t2().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            br.readLine();
            result.append("yes\n");
        }

        System.out.println(result.toString());
        br.close();
    }
}