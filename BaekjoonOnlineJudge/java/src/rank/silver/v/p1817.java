package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1817 {
    public static void main(String[] args) throws Exception {
        new p1817().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputSplit;
        inputSplit = br.readLine().split(" ");
        int n = Integer.parseInt(inputSplit[0]); // 책의 개수
        int m = Integer.parseInt(inputSplit[1]); // 박스에 넣을 수 있는 최대 무게

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] bookWeights = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); // 책 무게 배열로 변환
        int boxCount = 1;
        int curBoxWeight = 0;
        for (int i = 0; i < n; i++) {
            curBoxWeight += bookWeights[i];
            if (curBoxWeight > m) {
                boxCount++;
                curBoxWeight = bookWeights[i];
            }
        }

        System.out.println(boxCount);
    }
}