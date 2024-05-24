package rank.bronze.ii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
            int num = Integer.valueOf(inputStrSplit[0]) % 10; // 숫자 (1의 자리만 필요)
            int exponent = Integer.valueOf(inputStrSplit[1]); // 지수

            List<Integer> remainderList = new ArrayList<>(); // 1의 자리의 리스트
            int currentRemainder = num;
            while (!remainderList.contains(currentRemainder)) {
                remainderList.add(currentRemainder);
                currentRemainder = (currentRemainder * num) % 10;
            }

            int cycleSize = remainderList.size();
            int index = (exponent - 1) % cycleSize;
            sb.append(remainderList.get(index) == 0 ? 10 : remainderList.get(index)).append("\n");
        }
        System.out.println(sb);
    }
}
