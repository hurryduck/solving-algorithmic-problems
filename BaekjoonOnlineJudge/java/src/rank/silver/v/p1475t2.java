package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1475t2 {
    public static void main(String[] args) throws Exception {
        new p1475t2().solution();
    }    
    
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine(); // 입력 숫자
        int[] count = new int[10]; // 각 숫자의 개수를 저장하는 배열
        
        // 숫자 개수를 셈
        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            if (num == 9) num = 6; // 9는 6으로 취급
            count[num]++;
        }

        // 6과 9는 같은 세트로 처리하므로 합산 후 절반으로 나눔
        count[6] = (count[6] + 1) / 2; 

        // 최대값을 찾아 필요한 세트 수 결정
        int requiredSetCount = 0;
        for (int i = 0; i < 9; i++) {
            requiredSetCount = Math.max(requiredSetCount, count[i]);
        }

        System.out.println(requiredSetCount);
    }
}