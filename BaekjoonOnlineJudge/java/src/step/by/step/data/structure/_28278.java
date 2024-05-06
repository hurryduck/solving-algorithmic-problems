package step.by.step.data.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _28278 {
    public static void main(String[] args) throws Exception {
        new _28278().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(br.readLine());

        IntStack intStack = new IntStack();
        for (int i = 0; i < n; i++) {
            String[] inputStr = br.readLine().split(" ");
            switch (inputStr[0]) {
                case "1":
                    intStack.push(Integer.valueOf(inputStr[1]));
                    break;
                case "2":
                    sb.append(intStack.pop()).append("\n");
                    break;
                case "3":
                    sb.append(intStack.size()).append("\n");
                    break;
                case "4":
                    sb.append(intStack.isEmpty()).append("\n");
                    break;
                case "5":
                    sb.append(intStack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    private class IntStack {
        private class Node {
            private Node preNode;
            private int value;

            public Node(int value) {
                this.value = value;
            }

            public Node(Node preNode, int value) {
                this.preNode = preNode;
                this.value = value;
            }

            private Node getPreNode() {
                return this.preNode;
            }

            private int getValue() {
                return this.value;
            }
        }

        private Node curNode;
        private int size;

        public IntStack() {
            this.curNode = null;
            this.size = 0;
        }

        public void push(int num) {
            size++;
            if (curNode != null) {
                curNode = new Node(curNode, num);
            } else {
                curNode = new Node(num);
            }
        }

        public int pop() {
            if (curNode != null) {
                size--;
                int value = curNode.getValue();
                curNode = curNode.getPreNode();
                return value;
            } else {
                return -1;
            }
        }

        public int size() {
            return this.size;
        }

        public int isEmpty() {
            if (curNode == null) {
                return 1;
            } else {
                return 0;
            }
        }

        public int peek() {
            if (curNode != null) {
                return curNode.getValue();
            } else {
                return -1;
            }
        }
    }
}
