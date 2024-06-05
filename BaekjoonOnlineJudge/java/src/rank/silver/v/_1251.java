package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1251 {
    public static void main(String[] args) throws Exception{
        new _1251().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();

        List<String> strList = new ArrayList<>();

        for (int i = 1; i < inputStr.length(); i++) {
            for (int j = i + 1; j < inputStr.length(); j++) {
                strList.add(getWord(inputStr, i, j));
            }
        }

        Collections.sort(strList);
        System.out.println(strList.get(0));
    }

    private String getWord(final String STR, int index1, int index2) {
        StringBuilder s1 = new StringBuilder(STR.substring(0, index1));
        StringBuilder s2 = new StringBuilder(STR.substring(index1, index2));
        StringBuilder s3 = new StringBuilder(STR.substring(index2));
        StringBuilder sb = new StringBuilder();
        sb.append(s1.reverse()).append(s2.reverse()).append(s3.reverse());
        return sb.toString();
    }
}
