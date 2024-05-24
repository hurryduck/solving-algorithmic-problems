package rank.bronze.iv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2083 {
    public static void main(String[] args) throws Exception {
        new _2083().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) { // 테스트 반복
            String[] inputStrSplit = br.readLine().split(" ");
            if (inputStrSplit[0].equals("#")) { // 이름으로 #이 주어졌을 경우 테스 종료
                break;
            }

            sb.append(inputStrSplit[0]).append(" ");
            if (Integer.valueOf(inputStrSplit[1]) > 17 || Integer.valueOf(inputStrSplit[2]) >= 80) {
                sb.append("Senior");
            } else {
                sb.append("Junior");
            }
            sb.append('\n');

        }
        System.out.println(sb);
    }
}
