package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class p1384t2 {
    public static void main(String[] args) throws Exception {
        new p1384t2().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int groupNum = 0;

        while (true) {
            int studentNum = Integer.parseInt(br.readLine());
            if (studentNum == 0) break;

            groupNum++;
            String[] names = new String[studentNum];
            List<String[]> messages = new ArrayList<>();

            // 학생 이름과 평가 입력 받기
            for (int i = 0; i < studentNum; i++) {
                String[] input = br.readLine().split(" ");
                names[i] = input[0];
                messages.add(input);
            }

            result.append("Group ").append(groupNum).append("\n");
            boolean isAllKind = true;

            // 평가 확인
            for (int i = 0; i < studentNum; i++) {
                String[] curMessages = messages.get(i);
                for (int j = 1; j < curMessages.length; j++) {
                    if (curMessages[j].equals("N")) {
                        isAllKind = false;
                        int targetIndex = (i - j + studentNum) % studentNum;
                        result.append(names[targetIndex])
                              .append(" was nasty about ")
                              .append(names[i])
                              .append("\n");
                    }
                }
            }

            if (isAllKind) {
                result.append("Nobody was nasty\n");
            }

            result.append("\n");
        }

        System.out.print(result);
    }
}
