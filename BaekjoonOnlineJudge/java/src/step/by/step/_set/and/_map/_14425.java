package step.by.step._set.and._map;

import java.io.*;
import java.util.*;

public class _14425 {
    public static void main(String[] args) throws Exception {
        new _14425().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrSplit = br.readLine().split(" ");
        int n = Integer.valueOf(inputStrSplit[0]);
        int m = Integer.valueOf(inputStrSplit[1]);
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            wordSet.add(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (wordSet.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}