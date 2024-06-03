package rank.bronze.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _4101 {
    public static void main(String[] args) throws Exception {
        new _4101().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] inputStrSplit = br.readLine().split(" ");
            if (inputStrSplit[0].equals("0")) { // 0 0 입력시 입력 종료
                break;
            }
            int num1 = Integer.parseInt(inputStrSplit[0]);
            int num2 = Integer.parseInt(inputStrSplit[1]);
            sb.append(num1 > num2 ? "Yes" : "No").append("\n");
        }
        System.out.println(sb);
    }
}