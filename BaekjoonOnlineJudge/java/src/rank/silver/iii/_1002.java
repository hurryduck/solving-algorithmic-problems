package rank.silver.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1002 {
    public static void main(String[] args) throws Exception {
        new _1002().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] inputStrSplit = br.readLine().split(" ");
            int x1 = Integer.parseInt(inputStrSplit[0]);
            int y1 = Integer.parseInt(inputStrSplit[1]);
            int r1 = Integer.parseInt(inputStrSplit[2]);
            int x2 = Integer.parseInt(inputStrSplit[3]);
            int y2 = Integer.parseInt(inputStrSplit[4]);
            int r2 = Integer.parseInt(inputStrSplit[5]);
            double distance = getDistance(x1, y1, x2, y2);

            sb.append(getCircleIntersectionCount(distance, r1, r2)).append('\n');
        }
        System.out.println(sb);
    }

    private double getDistance(int x1, int y1, int x2, int y2) {
        double xDistance = Math.pow(x2 - x1, 2);
        double yDistance = Math.pow(y2 - y1, 2);
        return Math.sqrt(xDistance + yDistance);
    }

    private int getCircleIntersectionCount(double distance, int r1, int r2) {
        if (distance == 0 && r1 == r2) {
            return -1; // Infinite points of intersection
        } else if (distance > r1 + r2 || distance < Math.abs(r1 - r2)) {
            return 0; // No intersection
        } else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
            return 1; // One point of intersection
        } else {
            return 2; // Two points of intersection
        }
    }
}
