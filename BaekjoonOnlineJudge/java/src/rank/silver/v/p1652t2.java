package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1652t2 {
    public static void main(String[] args) throws Exception {
        new p1652t2().solution();
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
            int lieSpaceCount = 0;
            for (int row = 0; row < n; row++) {
                if (room[col][row]) {
                    lieSpaceCount++;
                } else {
                    if (lieSpaceCount >= 2) {
                        rowCount++;
                    }
                    lieSpaceCount = 0;
                }
            }
            if (lieSpaceCount >= 2) {
                rowCount++;
            }
        }
        
        int colCount = 0; // 세로로 누울 수 있는 장소
        for (int row = 0; row < n; row++) {
            int lieSpaceCount = 0;
            for (int col = 0; col < n; col++) {
                if (room[col][row]) {
                    lieSpaceCount++;
                } else {
                    if (lieSpaceCount >= 2) {
                        colCount++;
                    }
                    lieSpaceCount = 0;
                }
            }
            if (lieSpaceCount >= 2) {
                colCount++;
            }
        }

        System.out.println(rowCount + " " + colCount);
    }
}