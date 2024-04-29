package step.by.step._math;

import java.io.*;

public class _2485 {
    public static void main(String[] args) throws Exception {
        new _2485().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        int[] treesPoint = new int[n]; // 나무들의 좌표 List
        for (int i = 0; i < n; i++) {
            treesPoint[i] = Integer.valueOf(br.readLine());
        }
        
        int spaceGCD = getGCD(treesPoint[1] - treesPoint[0], 0); // 나무들 사이 거리들의 최대 공약수
        for (int i = 0; i < n - 1; i++) {
            spaceGCD = getGCD(spaceGCD, treesPoint[i + 1] - treesPoint[i]);
        }

        int treesLength = treesPoint[n - 1] - treesPoint[0]; // 가로수의 길이
        System.out.println((treesLength / spaceGCD) - n + 1);
    }

    // getGreatestCommonDenominator: 최대 공약수 구하기(유클리드 호제법)
    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
