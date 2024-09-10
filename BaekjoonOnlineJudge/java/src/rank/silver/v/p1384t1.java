package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class p1384t1 {
    public static void main(String[] args) throws Exception {
        new p1384t1().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder result = new StringBuilder();
        int groupNum = 0;
        while (true) {
            int studentNum = Integer.parseInt(br.readLine());
            if (studentNum == 0) {
                break;
            }
            
            groupNum++;

            List<Paper> studentPaperList = new ArrayList<>(); // 학생 종이 리스트
            for (int i = 0; i < studentNum; i++) {
                String[] inputSplit = br.readLine().split(" ");

                studentPaperList.add(new Paper(inputSplit));
            }

            result.append("Group " + groupNum + "\n");
            
            boolean isAllKind = true; // 모두가 착했는지 확인
            for (int i = 0; i < studentNum; i++) {
                String owner = studentPaperList.get(i).getOwner();
                String[] curMessageList = studentPaperList.get(i).getMessageList();

                for (int j = curMessageList.length - 1; j >= 0; j--) {
                    // 부정적으로 말한 학생이 있는 경우
                    if (curMessageList[j].equals("N")) {
                        isAllKind = false;
                        int targetIndex = (i + (curMessageList.length - j)) > studentNum ? (i + (curMessageList.length - j)) - 5 : (i + (curMessageList.length - j));
                        result.append(studentPaperList.get(targetIndex).getOwner()) // 부정적으로 메세지를 작성한 대상
                            .append(" was nasty about ")
                            .append(owner)
                            .append("\n");
                    }
                }
            }

            if (isAllKind) {
                result.append("Nobody was nasty\n");
            }

            result.append("\n"); // 그룹 구분
        }
        System.out.print(result);
    }

    // 학생 종이
    private class Paper {
        private String owner;
        private String[] messageList;
        
        public Paper(String[] strArray) {
            this.owner = strArray[0];
            this. messageList = Arrays.copyOfRange(strArray, 1, strArray.length);
        }

        public String getOwner() {
            return this.owner;
        }

        public String[] getMessageList() {
            return this.messageList;
        }
    }
}
