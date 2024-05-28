package rank.silver.iv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1015 {
    public static void main(String[] args) throws Exception {
        new _1015().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 배열 크기 입력 받음
        int n = Integer.parseInt(br.readLine());
        
        // 배열 값 입력 받음
        String[] inputStrSplit = br.readLine().split(" ");
        
        // 원본 배열 및 인덱스를 저장할 리스트 생성
        List<Element> origin = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(inputStrSplit[i]);
            origin.add(new Element(num, i));
        }
        
        // 원본 배열 복사 및 정렬
        List<Element> sorted = new ArrayList<>(origin);
        Collections.sort(sorted);
        
        // 정렬된 배열에서의 인덱스를 원본 배열 순서에 맞게 저장
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[sorted.get(i).index] = i;
        }
        
        // 결과 출력
        for (int value : result) {
            sb.append(value).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }

    // 정렬을 위한 요소 클래스
    private static class Element implements Comparable<Element> {
        int value;
        int index;
        
        Element(int value, int index) {
            this.value = value;
            this.index = index;
        }
        
        @Override
        public int compareTo(Element o) {
            if (this.value != o.value) {
                return Integer.compare(this.value, o.value);
            }
            // 값이 같은 경우, 원래 인덱스를 기준으로 비교
            return Integer.compare(this.index, o.index);
        }
    }
}
