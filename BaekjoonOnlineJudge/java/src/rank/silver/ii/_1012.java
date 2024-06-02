package rank.silver.ii;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1012 {
    public static void main(String[] args) throws Exception {
        new _1012().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        for (int i = 0; i < t; i++) {
            String[] inputStrSplit = br.readLine().split(" ");
            int m = Integer.parseInt(inputStrSplit[0]); // 밭의 가로 길이
            int n = Integer.parseInt(inputStrSplit[1]); // 밭의 세로 길이
            int k = Integer.parseInt(inputStrSplit[2]); // 심을 배추의 개수

            Field field = new Field(m, n); // 밭 생성
            for (int j = 0; j < k; j++) {
                String[] pos = br.readLine().split(" ");
                int x = Integer.parseInt(pos[0]); // x 좌표
                int y = Integer.parseInt(pos[1]); // y 좌표

                field.cabbage(x, y);// 배추 심기
            }

            // 인접한 배추끼리의 묶음 개수
            sb.append(field.getArea()).append("\n");
        }

        System.out.println(sb); // 결과 출력
    }

    private class Field {
        private int row; // 가로
        private int col; // 세로
        private int[][] field; // 밭
        private boolean[][] visited; // 방문 여부 확인
        
        // 상하좌우 좌표
        private int[] dx = {0, 0, 1, -1}; // x 방향
        private int[] dy = {1, -1, 0, 0}; // y 방향

        public Field(int row, int col) {
            this.row = row;
            this.col = col;
            this.field = new int[row][col];
            this.visited = new boolean[row][col];
        }

        public void cabbage(int x, int y) {
            field[x][y] = 1;
        }

        public int getArea() {
            int area = 0;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) { // 배추가 심어져있고 연결된적 없는 좌표일 경우
                        dfs(i, j); // 연결된 배추 확인
                        area++;
                    }
                }
            }
            return area;
        }

        // 연결된 배추 확인
        // 깊이 우선 탐색 (DFS)
        private void dfs(int x, int y) {
            visited[x][y] = true;

            for (int i = 0; i < 4; i++) { // 상화좌우 탐색
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < row && ny >= 0 && ny < col) { // nx, ny가 주어진 index 범위내인지 확인
                    if (field[nx][ny] == 1 && !visited[nx][ny]) {
                        dfs(nx, ny); // 연결된 배추 화인하기
                    }
                }
            }
        }
    }
}