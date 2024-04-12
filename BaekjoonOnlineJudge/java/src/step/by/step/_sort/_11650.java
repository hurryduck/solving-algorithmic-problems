package step.by.step._sort;

import java.io.*;
import java.util.*;

public class _11650 {
    public static void main(String[] args) throws Exception {
        new _11650().solution();
    }
    
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());

        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputStr = br.readLine().split(" ");
            int x = Integer.valueOf(inputStr[0]);
            int y = Integer.valueOf(inputStr[1]);
            points.add(new Point(x, y));
        }

        Collections.sort(points);

        for (Point point : points) {
            bw.write(point.getX() + " " + point.getY());
            bw.newLine();
        }
        bw.flush();
    }

    private class Point implements Comparable<Point> {
        private int x;
        private int y;

        public Point() {}

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        @Override
        public int compareTo(Point other) {
            if (this.x == other.x) {
                return this.y - other.y;
            }
            return this.x - other.x;
        }
    }
}