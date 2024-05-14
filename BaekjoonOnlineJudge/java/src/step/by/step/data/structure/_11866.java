package step.by.step.data.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _11866 {
    public static void main(String[] args) throws Exception {
        new _11866().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputStrSplit = br.readLine().split(" ");
        int n = Integer.valueOf(inputStrSplit[0]); // N명
        int k = Integer.valueOf(inputStrSplit[1]); // K번째

        List<Integer> people = new ArrayList<>(); // N명의 사람의 리스트
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }


        sb.append('<');
        int count = 0;
        int curIndex = 0;
        while (people.size() > 1) {
            count++;
            if (count == k) {
                sb.append(people.get(curIndex)).append(", ");
                people.remove(curIndex);
                count = 0;
                curIndex--;
            }

            curIndex++;
            if (curIndex >= people.size()) {
                curIndex -= people.size();
            }
        }
        sb.append(people.get(0)).append('>');
        System.out.println(sb);
    }
}
