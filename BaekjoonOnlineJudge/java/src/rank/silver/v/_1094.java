package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _1094 {
    public static void main(String[] args) throws Exception {
        new _1094().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> stickList = new LinkedList<>(); // 보유중인 막대
        stickList.add(64); // 최초 막대의 길이 64
        int targetLength = Integer.parseInt(br.readLine()); // 목표 막대 길이

        while (sum(stickList) > targetLength) { // 보유중인 막대의 합이 목표 막대 길이보다 길 경우
            Integer minStick = Collections.min(stickList); // 가지고 있는 막대 중 가장 짧은 막대
            stickList.remove(minStick);
            stickList.add(minStick / 2);
            if (sum(stickList) < targetLength) {
                stickList.add(minStick / 2);
            }
        }

        System.out.println(stickList.size());
    }

    private int sum(List<Integer> intList) {
        int total = 0;
        for (int n : intList) {
            total += n;
        }
        return total;
    }
}
