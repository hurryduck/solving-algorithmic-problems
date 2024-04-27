package step.by.step._math;

import java.io.*;

public class _13241 {
    public static void main(String[] args) throws Exception {
        new _13241().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrSplit = br.readLine().split(" ");
        
        long a = Integer.valueOf(inputStrSplit[0]); // 정수 A
        long b = Integer.valueOf(inputStrSplit[1]); // 정수 B
        
        br.close();

        System.out.println(getSmallestCommonMultiple(a, b)); // 최소공배수 출력
    }   

    private long getSmallestCommonMultiple(long a, long b) {
        long smallestCommonMultiple = 1; // 최소공배수
        // 소인수분해
        long div = 2;
        while (div <= a && div <= b) {
            if (a % div == 0 && b % div == 0) {
                smallestCommonMultiple *= div;
                a /= div;
                b /= div;
            }
            else {
                div++;
            }
        }
        return smallestCommonMultiple *= a * b; // 서로소 곱하여 반환
    }
}
