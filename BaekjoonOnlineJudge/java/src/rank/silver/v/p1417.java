package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class p1417 {
    public static void main(String[] args) throws Exception {
        new p1417().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 후보 수

        int no1 = Integer.parseInt(br.readLine()); // 기호 1번
        List<Integer> otherCandidate = new ArrayList<>(); // 다른 후보 득표수
        for (int i = 1; i < n; i++) {
            otherCandidate.add(Integer.parseInt(br.readLine()));
        }

        int voterBuyingCount = 0; // 매수 투표자 수
        otherCandidate.sort(Comparator.reverseOrder());
        while (otherCandidate.size() != 0 && no1 <= otherCandidate.get(0)) {
            voterBuyingCount++;
            no1++;
            otherCandidate.set(0, otherCandidate.get(0) - 1);
            otherCandidate.sort(Comparator.reverseOrder());
        }

        System.out.println(voterBuyingCount);
    }
}