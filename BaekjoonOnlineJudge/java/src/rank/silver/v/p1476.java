package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1476 {
    public static void main(String[] args) throws Exception {
        new p1476().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputSplit = br.readLine().split(" ");
        int e = Integer.parseInt(inputSplit[0]);
        int s = Integer.parseInt(inputSplit[1]);
        int m = Integer.parseInt(inputSplit[2]);

        int curYear = 0;

        // 년도 계산
        while (e != curYear % 15 + 1 || s != curYear % 28 + 1 || m != curYear % 19 + 1) {
            curYear++;
        }

        System.out.println(++curYear);
    }
}
