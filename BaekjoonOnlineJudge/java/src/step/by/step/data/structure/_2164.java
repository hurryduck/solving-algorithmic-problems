package step.by.step.data.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class _2164 {
    public static void main(String[] args) throws Exception {
        new _2164().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deck deck = new Deck(Integer.valueOf(br.readLine()));

        while (!deck.isOneCard()) {
            deck.popFront(); // 맨 위 카드 버리기
            deck.pushBack(deck.popFront()); // 맨 위 카드 맨 아래로 보내기
        }
        System.out.println(deck.getCard(0));
    }

    private class Deck {
        private List<Integer> deck;
        
        public Deck(int size) {
            deck = new LinkedList<>();
            for (int i = 1; i <= size; i++) {
                deck.add(i);
            }
        }

        public void pushBack(int card) {
            deck.add(card);
        }

        public int popFront() {
            int card = deck.get(0);
            deck.remove(0);
            return card;
        }

        public boolean isOneCard() {
            return deck.size() == 1;
        }

        public int getCard(int index){
            return deck.get(index);
        }
    }
}
