package rank.bronze.i;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1032 {
    public static void main(String[] args) throws Exception {
        new _1032().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine()); // 파일의 개수
        StringBuilder searchWord = new StringBuilder();
        searchWord.append(br.readLine());
        for (int i = 0; i < n -1; i++) {
            String other = br.readLine();
            for (int j = 0; j < searchWord.length(); j++) {
                if (searchWord.charAt(j) != other.charAt(j)) {
                    searchWord.setCharAt(j, '?');
                }
            }
        }
        System.out.println(searchWord);
    }
}
