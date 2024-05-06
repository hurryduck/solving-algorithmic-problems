package step.by.step.data.structure;

import java.io.*;

public class _10773 {
    public static void main(String[] args) throws Exception {
        new _10773().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        IntStack intStack = new IntStack();
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(br.readLine());
            if (num != 0) {
                intStack.push(num);
            } else {
                intStack.pop();
            }
        }
        System.out.println(intStack.getTotal());
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
        private int total;

        public IntStack() {
            this.curNode = null;
            this.total = 0;
        }

        public void push(int num) {
            if (curNode != null) {
                curNode = new Node(curNode, num);
            } else {
                curNode = new Node(num);
            }
            this.total += num;
        }

        public int pop() {
            if (curNode != null) {
                int value = curNode.getValue();
                curNode = curNode.getPreNode();
                this.total -= value;
                return value;
            } else {
                return -1;
            }
        }

        public int getTotal() {
            return this.total;
        }
    }
}