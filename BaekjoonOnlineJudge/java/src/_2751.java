import java.io.*;
import java.util.*;

public class _2751 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 수의 개수 입력 N
        int N = Integer.parseInt(br.readLine());
        // N 크기의 배열 생성 및 정수 배열에 대입
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        // 배열 정렬
        Arrays.sort(nums);
        // 배열 출력
        for (int num : nums) {
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new _2751().solution();
    }
}
