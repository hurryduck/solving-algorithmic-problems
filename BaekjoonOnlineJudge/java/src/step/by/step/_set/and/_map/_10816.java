package step.by.step._set.and._map;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class _10816 {
    public static void main(String[] args) throws Exception {
        new _10816().solution();
    }   

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deck playerDeck = new Deck(br.readLine(), br.readLine());
        Deck checkDeck = new Deck(br.readLine(), br.readLine());

        String outputStr = matchDeck(playerDeck, checkDeck);
        System.out.println(outputStr);
    }

    private class Deck {
        private int count;
        private List<Integer> deckList = new ArrayList<>();
        private Map<Integer, Integer> deckCardCount;

        public Deck(String count, String deckStr) {
            this.count = Integer.valueOf(count);
            String[] deckStrSplit = deckStr.split(" ");
            for (int i = 0; i < deckStrSplit.length; i++) {
                deckList.add(Integer.valueOf(deckStrSplit[i]));
            }
            this.deckCardCount = deckList.stream()
                .collect(Collectors.toMap(
                    card -> card, 
                    card -> 1,
                    (oldValue, newValue) -> oldValue + 1
                ));
        }

        public int getCard(int index) {
            return this.deckList.get(index);
        }

        public int getSize() {
            return this.count;
        }

        public int getCardCount(int num) {
            return deckCardCount.getOrDefault(num, 0);
        }
    }

    private static String matchDeck(Deck playerDeck, Deck checkDeck) {
        StringBuilder outputStr = new StringBuilder();
        for (int i = 0; i < checkDeck.getSize(); i++) {
            outputStr.append(playerDeck.getCardCount(checkDeck.getCard(i)));
            outputStr.append(" ");
        }
        return outputStr.toString().trim();
    }   
}