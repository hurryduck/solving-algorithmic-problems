package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p1475t1 {
    public static void main(String[] args) throws Exception {
        new p1475t1().solution();
    }    
    
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine(); // N

        int requiredSetCount = 0; // 필요한 세트 수
        List<Character> haveNum = new ArrayList<>();
        
        for (int i = 0; i < n.length(); i++) {
            char curChar = n.charAt(i) == '9' ? '6' : n.charAt(i);
            if (!haveNum.contains(curChar)) {
                requiredSetCount++;
                haveNum.addAll(List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '6'));
            }
            haveNum.remove(haveNum.indexOf(curChar));
        }
        System.out.println(requiredSetCount);
    }
}