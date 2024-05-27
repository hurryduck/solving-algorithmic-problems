package rank.bronze.ii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class _1076 {
    public static void main(String[] args) throws Exception {
        new _1076().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Long[]> resistanceTable = Map.of(
            "black",    new Long[] {0l, 1l},
            "brown",    new Long[] {1l, 10l},
            "red",      new Long[] {2l, 100l},
            "orange",   new Long[] {3l, 1000l},
            "yellow",   new Long[] {4l, 10000l},
            "green",    new Long[] {5l, 100000l},
            "blue",     new Long[] {6l, 1000000l},
            "violet",   new Long[] {7l, 10000000l},
            "grey",     new Long[] {8l, 100000000l},
            "white",    new Long[] {9l, 1000000000l}
        );

        long resistanceNum = 0;
        resistanceNum += resistanceTable.get(br.readLine())[0] * 10;
        resistanceNum += resistanceTable.get(br.readLine())[0];
        resistanceNum *= resistanceTable.get(br.readLine())[1];

        System.out.println(resistanceNum);
    }
}
