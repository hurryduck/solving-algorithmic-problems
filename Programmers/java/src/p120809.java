import java.util.Arrays;
import java.util.stream.IntStream;

public class p120809 {
    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5};

        // 배열을 스트림으로 변환하고 각 요소를 두 배로 만든 후 다시 배열로 변환
        answer = IntStream.of(answer)
                          .map(num -> num * 2)
                          .toArray();

        // 결과 출력
        System.out.println(Arrays.toString(answer));
    }
}
