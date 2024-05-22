package rank.bronze.ii;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1009 {
    public static void main(String[] args) throws Exception {
        new _1009().solution();
    }

    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.valueOf(br.readLine()); // 테스트 케이스 t
        for (int i = 0; i < t; i++) {
            String[] inputStrSplit = br.readLine().split(" ");
            int num = Integer.valueOf(inputStrSplit[0]); // 숫자
            int exponent = Integer.valueOf(inputStrSplit[1]); // 지수

            
        }
    }
}
