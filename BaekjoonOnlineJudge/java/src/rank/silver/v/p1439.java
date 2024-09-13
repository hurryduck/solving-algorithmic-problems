package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1439 {
    public static void main(String[] args) throws Exception {
        new p1439().solution();
    }
    
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int partCount = 0;
        char pastChar = s.charAt(0); // 이전 문자
        for (int i = 1; i < s.length(); i++) {
            if (pastChar != s.charAt(i)) { // 이전 문자 비교
                partCount++;
                pastChar = s.charAt(i);
            }
        }

        System.out.println(Math.round(partCount / 2.0));
    }
}