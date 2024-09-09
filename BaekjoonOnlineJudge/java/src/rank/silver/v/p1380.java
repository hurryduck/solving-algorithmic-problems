package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p1380 {
    public static void main(String[] args) throws Exception {
        new p1380().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result = new StringBuilder(); // 결과 출력
        int scenarioCount = 0;
        while (true) {
            int studentNum = Integer.parseInt(br.readLine());
            if (studentNum == 0) {
                break;
            }

            scenarioCount++; // 시나리오 시작

            String[] studentList = new String[studentNum]; // 학생 리스트 저장
            for (int i = 0; i < studentNum; i++) {
                studentList[i] = br.readLine();
            }

            Set<Integer> studentSet = new HashSet<>(); // 돌려 받지 못한 학생 Set
            for (int i = 0; i < 2 * studentNum - 1; i++) {
                String[] inputSplit = br.readLine().split(" ");
                int studentNo = Integer.parseInt(inputSplit[0]);

                if (studentSet.contains(studentNo)) {
                    studentSet.remove(studentNo);
                } else {
                    studentSet.add(studentNo);
                }
            }

            int missingStudentNo = studentSet.iterator().next();
            result.append(scenarioCount)
                .append(" ")
                .append(studentList[missingStudentNo - 1])
                .append("\n");
        }

        System.out.println(result);
    }
}