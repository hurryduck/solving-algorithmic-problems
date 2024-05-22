package rank.bronze.iv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;

public class _1264 {
    public static void main(String[] args) throws Exception {
        new _1264().solution(); 
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u'); // 모음의 종류
        int count; // 모음의 개수
         // 입력 받기
        while (true) {
            String inputStr = br.readLine();
            inputStr = inputStr.toLowerCase();

            if (inputStr.equals("#")) { // #입력시 입력 받기 종료
                break;
            }
            
            // 모음 개수 세기
            count = 0;
            for (int i = 0; i < inputStr.length(); i++) { 
                if (vowelSet.contains(inputStr.charAt(i))) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        // 결과 출력하기
        System.out.println(sb); 
    }
}
