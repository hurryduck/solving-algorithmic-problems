package step.by.step.data.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class _18258 {
    public static void main(String[] args) throws Exception {
        new _18258().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(br.readLine()); // 명령 수
        IntQueue intQueue = new IntQueue();

        for (int i = 0; i < n; i++) {
            String[] inputStrSplit = br.readLine().split(" "); // 명령
            switch (inputStrSplit[0]) { // 명령에 따른 처리
                case "push": // 정수 X를 큐에 넣는 연산
                    int x = Integer.valueOf(inputStrSplit[1]);
                    intQueue.push(x);
                    break;

                case "pop": // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가없는 경우에는 -1을 출력한다.
                    sb.append(intQueue.pop()).append('\n');
                    break;
                    
                case "size": // 큐에 들어있는 정수의 개수를 출력한다.
                    sb.append(intQueue.size()).append('\n');
                    break;

                case "empty": // 큐가 비어있으면 1, 아니면 0을 출력한다.
                    sb.append(intQueue.empty()).append('\n');
                    break;

                case "front": // 큐의 가장 앞에 있는 청수를 출력한다.만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    sb.append(intQueue.front()).append('\n');
                    break;

                case "back": // 큐의 가장 뒤에 있는 청수를 출력한다.만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    sb.append(intQueue.back()).append('\n');
                    break;
            }
        }

        System.out.println(sb); // 결과 출력
    }

    private class IntQueue {
        private List<Integer> list;
        
        public IntQueue() {
            this.list = new LinkedList<>();
        }

        // 정수 X를 큐에 넣는 연산
        public void push(int x) {
            this.list.add(x);
        }

        // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가없는 경우에는 -1을 출력한다.
        public int pop() {
            if (this.list.isEmpty()) {
                return -1;
            }

            int returnInt = this.list.get(0);
            this.list.remove(0);

            return returnInt;
        }

        // 큐에 들어있는 정수의 개수를 출력한다.
        public int size() {
            return this.list.size();
        }

        // 큐가 비어있으면 1, 아니면 0을 출력한다.
        public int empty() {
            return this.list.isEmpty() ? 1 : 0;
        }

        // 큐의 가장 앞에 있는 청수를 출력한다.만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int front() {
            return this.list.isEmpty() ? -1 : this.list.get(0);
        }

        // 큐의 가장 뒤에 있는 청수를 출력한다.만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        public int back() {
            return this.list.isEmpty() ? -1 : this.list.get(this.list.size() - 1);
        }
    }
}