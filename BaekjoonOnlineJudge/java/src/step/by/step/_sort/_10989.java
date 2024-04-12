package step.by.step._sort;

import java.io.*;
import java.util.Arrays;

public class _10989 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.valueOf(br.readLine());
        
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(br.readLine());
        }

        Arrays.sort(nums);
        for (int num : nums) {
            sb.append(String.valueOf(num)).append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception{
        new _10989().solution();
    }
}