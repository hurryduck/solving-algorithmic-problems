package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1543 {
    public static void main(String[] args) throws Exception {
        new p1543().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String doc = br.readLine(); // 문서
        String searchKeyword = br.readLine(); // 검색어

        int correctCount = 0; // 맞은 개수
        
        for (int i = 0; i < doc.length(); i++) {
            if (doc.charAt(i) == searchKeyword.charAt(0)) {
                if (i + searchKeyword.length() <= doc.length()) {
                    String docPart = doc.substring(i, i + searchKeyword.length());

                    if (searchKeyword.equals(docPart)) {
                        correctCount++;
                        i += searchKeyword.length() - 1;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println(correctCount);
    }
}