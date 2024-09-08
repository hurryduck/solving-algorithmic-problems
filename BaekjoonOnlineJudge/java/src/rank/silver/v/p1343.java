package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1343 {
    public static void main(String[] args) throws Exception {
        new p1343().solution();
    }

    private void solution() throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        StringBuilder result = new StringBuilder();
        int xCount = 0;

        for (int i = 0; i <= board.length(); i++) {
            // 처리할 문자가 'X'인 경우
            if (i < board.length() && board.charAt(i) == 'X') {
                xCount++;
                continue;
            }
            
            // 'X'가 끝나고, '.'이거나 문자열 끝일 때 처리
            if (xCount > 0) {
                if (xCount % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                result.append("AAAA".repeat(xCount / 4));
                result.append("BB".repeat((xCount % 4) / 2));
                xCount = 0;
            }
            
            // '.'인 경우
            if (i < board.length() && board.charAt(i) == '.') {
                result.append(".");
            }
        }

        System.out.println(result);
    }
}