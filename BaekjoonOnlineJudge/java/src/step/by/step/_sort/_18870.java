package step.by.step._sort;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class _18870 {
    public static void main(String[] args) throws Exception {
        new _18870().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n 입력 버림
        br.readLine();
        // 입력된 자표 리스트에 저장
        List<Integer> points = Arrays.asList(br.readLine().split(" ")).stream()
            .map(str -> Integer.valueOf(str))
            .collect(Collectors.toList());
            
        // 중복 제거
        List<Integer> compressedPoints = new ArrayList<>(new HashSet<>(points));
        // 오름차순 정렬
        Collections.sort(compressedPoints);

        // 좌표 압축
        StringBuilder outputStr = new StringBuilder();
        for (int point : points) {
            outputStr.append(Collections.binarySearch(compressedPoints, point)).append(" ");
        }

        System.out.println(outputStr.toString().trim());
    }
}