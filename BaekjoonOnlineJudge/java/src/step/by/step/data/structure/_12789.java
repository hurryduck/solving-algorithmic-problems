package step.by.step.data.structure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _12789 {
    public static void main(String[] args) throws Exception {
        new _12789().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.valueOf(br.readLine());

        String[] inputStrSplit = br.readLine().split(" ");
        Queue<Integer> waitingOrder = new LinkedList<>(); // 앞에 선 번호표 순서
        for (int i = 0; i < N; i++) {
            waitingOrder.offer(Integer.valueOf(inputStrSplit[i]));
        }

        if (checkGetSnacks(waitingOrder)) {
            System.out.println("Nice"); 
        } else {
            System.out.println("Sad");
        }

        br.close();
    }

    private boolean checkGetSnacks(Queue<Integer> waitingOrder) {
        Stack<Integer> sideStreet = new Stack<>(); // 한 명씩 설 수 있는 공간(이하 옆길)
        int curOrder = 1; // 현재 순번

        while (!waitingOrder.isEmpty()) {
            if (curOrder == waitingOrder.peek()) { // 현재 순번과 대기 순번이 일치할 경우
                waitingOrder.poll(); // 간식 수령
                curOrder++; // 현재 순번 증가
            } else {
                if (!sideStreet.isEmpty() && curOrder == sideStreet.peek()) { // 옆길에 사람이 있는 경우
                    sideStreet.pop(); // 간식 수령
                    curOrder++; // 현재 순번 증가
                } else if (!sideStreet.isEmpty() && waitingOrder.peek() > sideStreet.peek()) {
                    return false; // 간식 받기 실패
                } else {
                    sideStreet.push(waitingOrder.poll()); // 대기줄에서 옆길로 이동
                }
            }
        }
        return true;
    }
}