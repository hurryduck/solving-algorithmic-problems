package rank.bronze.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1267 {
    public static void main(String[] args) throws Exception {
        new _1267().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.valueOf(br.readLine()); // 이용 한 통화의 개수
        String[] inputStrSplit = br.readLine().split(" "); // 통화 목록
        
        int y = 0; // 영식 요금제
        int m = 0; // 민식 요금제
        for (int i = 0; i < n; i++) {
            int callTime = Integer.valueOf(inputStrSplit[i]);
            y += (callTime / 30 + 1) * 10;
            m += (callTime / 60 + 1) * 15;
        }

        if (y < m) {
            System.out.println("Y " + y);
        } else if (m < y) {
            System.out.println("M " + m);
        } else {
            System.out.println("Y " + "M " + y);
        }
    }
}
