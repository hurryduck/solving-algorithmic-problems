package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1996 {
    public static void main(String[] args) throws Exception {
        new p1996().solution();
    }

    private void solution() throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // N

        int[][] map = new int[n][n]; // map
        for (int col = 0; col < n; col++) {
            String inputStr = br.readLine();
            for (int row = 0; row < n; row++) {
                map[col][row] = '.' == inputStr.charAt(row) ? 0 : inputStr.charAt(row) - '0';
            }
        }

        StringBuilder result = new StringBuilder();
        for (int col = 0; col < n; col++) {
            counting:
            for (int row = 0; row < n; row++) {
                if (map[col][row] == 0) {
                    // 인접한 8개의 칸의 지뢰 찾기
                    int landMineCount = 0;
                    for (int y = Math.max(col - 1, 0); y < Math.min(col + 2, n); y++) {
                        for (int x = Math.max(row - 1, 0); x < Math.min(row + 2, n); x++) {
                            landMineCount += map[y][x];
                            if (landMineCount > 9) {
                                result.append("M");
                                continue counting;
                            }
                        }
                    }
                    result.append(landMineCount);
                } else {
                    result.append("*");
                }
            }
            result.append('\n');
        }

        System.out.println(result);
        br.close();
    }
}