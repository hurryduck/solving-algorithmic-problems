package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1769 {
    public static void main(String[] args) throws Exception {
        new p1769().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = br.readLine();  // 입력된 수를 문자열로 받음
        int convertCount = 0;

        while (x.length() > 1) {  // x의 자릿수가 1 이상이면 반복
            convertCount++;  // 변환 횟수 증가

            int curSum = 0;
            for (int i = 0; i < x.length(); i++) {
                curSum += x.charAt(i) - '0';  // 각 자릿수를 더함
            }

            x = String.valueOf(curSum);  // 더한 값을 다시 문자열로 변환
        }

        System.out.println(convertCount);
        System.out.println(Integer.parseInt(x) % 3 == 0 ? "YES" : "NO");
    }
}
