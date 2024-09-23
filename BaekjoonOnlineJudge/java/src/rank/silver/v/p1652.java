package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1652 {
    public static void main(String[] args) throws Exception {
        new p1652().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // N

        boolean[][] room = new boolean[n][n]; // 방
        for (int col = 0; col < n; col++) {
            String roomState = br.readLine();
            for (int row = 0; row < roomState.length(); row++) {
                if (roomState.charAt(row) == '.') {
                    room[col][row] = true;
                } else {
                    room[col][row] = false;
                }
            }
        }

        int rowCount = 0; // 가로로 누울 수 있는 장소
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n - 1; row++) {
                if (room[col][row] && room[col][row + 1]) {
                    rowCount++;
                }
            }
        }
        
        int colCount = 0; // 세로로 누울 수 있는 장소
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - 1; col++) {
                if (room[col][row] && room[col + 1][row]) {
                    colCount++;
                }
            }
        }

        System.out.println(rowCount + " " + colCount);
    }
}