package step.by.step.data.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2346_fail {
    public static void main(String[] args) throws Exception {
        new _2346_fail().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(br.readLine());
        String[] inputStrSplit = br.readLine().split(" ");

        IntCircularQueue intCircularQueue = new IntCircularQueue(n);
        for (int i = 0; i < inputStrSplit.length; i++) {
            sb.append(intCircularQueue.pop(Integer.valueOf(inputStrSplit[i]))).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private class IntCircularQueue {
        private class Node {
            private int value;
            private Node preNode;
            private Node nextNode;

            public Node(int value, Node preNode, Node nextNode) {
                this.value = value;
                this.preNode = preNode;
                this.nextNode = nextNode;
            }

            public int getValue() {
                return this.value;
            }
            
            public void setPreNode(Node preNode) {
                this.preNode = preNode;
            }

            public Node getPreNode() {
                return this.preNode;
            }

            public void setNextNode(Node nextNode) {
                this.nextNode = nextNode;
            }

            public Node getNextNode() {
                return this.nextNode;
            }
        }

        private Node frontNode;
        private Node rearNode;
        private Node curNode;

        public IntCircularQueue(int size) {
            this.frontNode = new Node(1, null, null);
            this.frontNode.setPreNode(this.frontNode);
            this.frontNode.setNextNode(this.frontNode);
            this.rearNode = this.frontNode;
            this.curNode = this.frontNode;
            
            for (int i = 2; i <= size; i++) {
                addBack(i);
            }

            this.curNode = this.frontNode;
        }

        private void addBack(int num) {
            this.rearNode = new Node(num, this.curNode, this.frontNode);
            this.frontNode.setPreNode(this.rearNode);
            this.curNode.setNextNode(this.rearNode);
            this.curNode = this.rearNode;
        }

        public int pop(int index) {
            int poppedValue = this.curNode.getValue();

            for (int i = 0; i < Math.abs(index); i++) {
                if (index > 0) {
                    getNextNode();
                } else {
                    getPreNode();
                }
            }
        
            this.curNode.getPreNode().setNextNode(this.curNode.getNextNode());
            this.curNode.getNextNode().setPreNode(this.curNode.getPreNode());
        
            return poppedValue;
        }
        

        private Node getPreNode() {
            if (this.curNode.equals(this.frontNode)) {
                this.curNode = this.rearNode;
            } else {
                this.curNode = this.curNode.getPreNode();
            }
            return this.curNode;
        }

        private Node getNextNode() {
            this.curNode = this.curNode.getNextNode();
            return this.curNode;
        }
    }
}
