package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1531 {
    public static void main(String[] args) throws Exception {
        new p1531().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[100][100];
        String[] inputSplit = br.readLine().split(" ");
        int n = Integer.parseInt(inputSplit[0]);
        int m = Integer.parseInt(inputSplit[1]);

        for (int i = 0; i < n; i++) {
            inputSplit = br.readLine().split(" ");
            int x1 = Integer.parseInt(inputSplit[0]) - 1;
            int y1 = Integer.parseInt(inputSplit[1]) - 1;
            int x2 = Integer.parseInt(inputSplit[2]) - 1;
            int y2 = Integer.parseInt(inputSplit[3]) - 1;

            for (int col = y1; col <= y2; col++) {
                for (int row = x1; row <= x2; row++) {
                    board[col][row]++;
                }
            }
        }

        int invisiblePictureCount = 0;
        for (int col = 0; col < board.length; col++) {
            for (int row = 0; row < board[col].length; row++) {
                if (board[col][row] > m) {
                    invisiblePictureCount++;
                }
            }
        }

        System.out.println(invisiblePictureCount);
    }
}
