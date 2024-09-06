package rank.silver.iv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class p1026_1 {
    public static void main(String[] args) throws Exception {
        new p1026_1().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 길이 n
        List<Integer> aList = (Arrays.stream(br.readLine().split(" ")) // 배열 A
                .map(Integer::parseInt))
                .collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(br.readLine().split(" ")) // 배열 B
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(aList); // 배열 A를 오름차순 정렬
        
        Collections.sort(bList, Collections.reverseOrder()); // 배열 B를 내림차순 정렬
        
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += aList.get(i) * bList.get(i);
        }

        System.out.println(s);
    }
}
