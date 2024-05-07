package step.by.step.data.structure;

import java.io.*;
import java.util.*;

public class _9012 {
    public static void main(String[] args) throws Exception {
        new _9012().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.valueOf(br.readLine()); // 테스트 케이스

        for (int i = 0; i < t; i++) {
            String inputStr = br.readLine();
            if (isValidPs(inputStr)) { // 올바른 괄호 확인
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);

        br.close();
    }

    private boolean isValidPs(String ps) {
        Stack<Character> stack = new Stack<>();
        for (char c : ps.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
