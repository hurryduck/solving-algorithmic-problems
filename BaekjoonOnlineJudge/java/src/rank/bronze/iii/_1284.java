package rank.bronze.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1284 {
    public static void main(String[] args) throws Exception {
        new _1284().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String inputStr = br.readLine();
            if (inputStr.equals("0")) {
                break;
            }

            int numBoard = 2; // 호수판 경계 1cm
            for (int i = 0; i < inputStr.length(); i++) {
                if (inputStr.charAt(i) == '0') {
                    numBoard += 4;
                } else if (inputStr.charAt(i) == '1') {
                    numBoard += 2;
                } else {
                    numBoard += 3;
                }
                numBoard++;
            }
            numBoard--;
            sb.append(numBoard).append("\n");
        }
        System.out.println(sb);
    }
}
