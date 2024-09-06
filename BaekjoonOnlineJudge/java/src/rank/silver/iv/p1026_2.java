package rank.silver.iv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class p1026_2 {
    public static void main(String[] args) throws Exception {
        new p1026_2().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 길이 n
        List<Integer> aList = Arrays.stream(br.readLine().split(" ")) // 배열 A
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(br.readLine().split(" ")) // 배열 B
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(aList, Collections.reverseOrder());

        // 값과 인덱스가 있는 리스트 생성
        List<Pair> bListWithIndex = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bListWithIndex.add(new Pair(bList.get(i), i));
        }

        // 값을 기준으로 정렬
        bListWithIndex.sort(Comparator.comparingInt(Pair::getValue));

        // 정렬된 순서에 따라 순위 매기기
        List<Integer> bListRank = new ArrayList<>(Collections.nCopies(n, 0));
        for (int rank = 0; rank < bListWithIndex.size(); rank++) {
            bListRank.set(bListWithIndex.get(rank).getIndex(), rank);
        }

        StringBuilder resultA = new StringBuilder();
        int s = 0;
        for (int i = 0; i < n; i++) {
            int aElement = aList.get(bListRank.get(i));
            resultA.append(aElement).append(" ");
            s += aElement * bList.get(i);
        }

        System.out.println(resultA);
        System.out.println(s);
    }

    private static class Pair {
        private final int vlaue;
        private final int index;

        public Pair(int vlaue, int index) {
            this.vlaue = vlaue;
            this.index = index;
        }

        public int getValue() {
            return vlaue;
        }

        public int getIndex() {
            return index;
        }
    }
}