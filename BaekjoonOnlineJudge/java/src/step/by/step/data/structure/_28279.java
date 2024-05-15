package step.by.step.data.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class _28279 {
    public static void main(String[] args) throws Exception {
        new _28279().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(br.readLine());

        IntDeque intDeque = new IntDeque();
        for (int i = 0; i < n; i++) {
            String[] inputStrSplit = br.readLine().split(" ");
            switch (inputStrSplit[0]) {
                case "1":
                    intDeque.pushFront(Integer.valueOf(inputStrSplit[1]));
                    break;
                case "2":
                    intDeque.pushBack(Integer.valueOf(inputStrSplit[1]));
                    break;
                case "3":
                    sb.append(intDeque.popFront()).append('\n');
                    break;
                case "4":
                    sb.append(intDeque.popBack()).append('\n');
                    break;
                case "5":
                    sb.append(intDeque.size()).append('\n');
                    break;
                case "6":
                    sb.append(intDeque.isEmpty()).append('\n');
                    break;
                case "7":
                    sb.append(intDeque.peekFront()).append('\n');
                    break;
                case "8":
                    sb.append(intDeque.peekBack()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }

    private class IntDeque {
        private List<Integer> intDeque;

        public IntDeque() {
            this.intDeque = new LinkedList<>();
        }

        // 정수 X를 덱의 앞에 넣는다.
        public void pushFront(int x) {
            this.intDeque.add(0, x);
        }

        // 정수 X를 데의 뒤에 넣는다.
        public void pushBack(int x) {
            this.intDeque.add(x);
        }

        // 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없으면 -1을 대신 출력한다.
        public int popFront() {
            if (this.intDeque.isEmpty()) {
                return -1;
            }

            int value = this.intDeque.get(0);
            this.intDeque.remove(0);
            return value;
        }

        // 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없으면 -1을 대신 출력한다.
        public int popBack() {
            if (this.intDeque.isEmpty()) {
                return -1;
            }

            int value = this.intDeque.get(intDeque.size() - 1);
            this.intDeque.remove(intDeque.size() - 1);
            return value;
        }

        public int size() {
            return this.intDeque.size();
        }

        public int isEmpty() {
            return this.intDeque.isEmpty() ? 1 : 0;
        }

        // 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없으면 -1을 대신 출력한다.
        public int peekFront() {
            if (this.intDeque.isEmpty()) {
                return -1;
            }
            return this.intDeque.get(0);
        }

        // 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없으면 -1을 대신 출력한다.
        public int peekBack() {
            if (this.intDeque.isEmpty()) {
                return -1;
            }
            return this.intDeque.get(intDeque.size() - 1);
        }
    }
}
