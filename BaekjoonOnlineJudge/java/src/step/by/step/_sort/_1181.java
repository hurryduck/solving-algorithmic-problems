package step.by.step._sort;

import java.io.*;
import java.util.*;

public class _1181 {
    public static void main(String[] args) throws Exception {
        new _1181().solution();
    }

    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            wordSet.add(br.readLine());
        }

        List<String> wordList = new ArrayList<>(wordSet);
        Collections.sort(wordList, (str1, str2) -> {
            if (str1.length() == str2.length()) {
                return str1.compareTo(str2);
            }
            return str1.length() - str2.length();
        });

        for (int i = 0; i < wordList.size(); i++) {
            bw.write(wordList.get(i));
            bw.newLine();
        }
        bw.flush();
    }
}
