package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1268 {
    public static void main(String[] args) throws Exception {
        new _1268().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int studentNum = Integer.parseInt(br.readLine()); // 학생들의 수
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentNum; i++) { // 학생들의 이전 반 정보 저장
            String[] gradeClassHistory = br.readLine().split(" ");
            students.add(new Student(i + 1, gradeClassHistory)); // 학생 번호는 1부터 시작
        }

        // 같은 반이었던 학생 수 세기
        for (Student student : students) {
            student.countSameClassmates(students);
        }

        // 임시 반장 학생 번호 출력
        Collections.sort(students);
        System.out.println(students.get(0).getNo());
    }

    private class Student implements Comparable<Student> {
        private int no; // 학생 번호
        private int[] gradeClassHistory; // 반 정보
        private int sameCount; // 같은 반이었던 학생 수

        public Student(int no, String[] strgradeClassHistory) {
            this.no = no;
            this.gradeClassHistory = new int[strgradeClassHistory.length];
            for (int i = 0; i < strgradeClassHistory.length; i++) {
                this.gradeClassHistory[i] = Integer.parseInt(strgradeClassHistory[i]);
            }
        }

        public int getNo() {
            return this.no;
        }

        public void countSameClassmates(List<Student> students) {
            this.sameCount = 0;
            for (Student other : students) {
                if (this.no != other.no) { // 자기 자신 제외
                    for (int grade = 0; grade < this.gradeClassHistory.length; grade++) {
                        if (this.gradeClassHistory[grade] == other.gradeClassHistory[grade]) {
                            this.sameCount++;
                            break;
                        }
                    }
                }
            }
        }

        @Override
        public int compareTo(Student other) {
            if (this.sameCount == other.sameCount) { // 같은 반 수가 같을 경우 학생 번호에 따라 정렬
                return Integer.compare(this.no, other.no);
            }
            return Integer.compare(other.sameCount, this.sameCount); // 내림차순 정렬
        }
    }
}
