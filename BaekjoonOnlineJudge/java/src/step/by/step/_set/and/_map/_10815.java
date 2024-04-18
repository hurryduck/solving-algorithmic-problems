package step.by.step._set.and._map;

import java.io.*;
import java.util.*;

public class _10815 {
    public static void main(String[] args) throws Exception {
        new _10815().solution();
    }    

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deck playerDeck = new Deck(br.readLine(), br.readLine());
        Deck checkDeck = new Deck(br.readLine(), br.readLine());

        String outputStr = new MatchDeck().matchDeck(playerDeck, checkDeck);
        System.out.println(outputStr);
    }

    private class Deck {
        private int count;
        private List<Integer> deckList = new ArrayList<>();
        private Set<Integer> deckSet;

        public Deck(String count, String deckStr) {
            this.count = Integer.valueOf(count);
            String[] deckStrSplit = deckStr.split(" ");
            for (int i = 0; i < deckStrSplit.length; i++) {
                deckList.add(Integer.valueOf(deckStrSplit[i]));
            }
            this.deckSet = new HashSet<>(deckList);
        }

        public int getSize() {
            return this.count;
        }

        public int getCard(int index) {
            return this.deckList.get(index);
        }

        public boolean isContain(int num) {
            return this.deckSet.contains(num);
        }
    }

    private class MatchDeck {
        public String matchDeck(Deck playerdDeck, Deck checkDeck) {
            StringBuilder outputStr = new StringBuilder();
            for (int i = 0; i < checkDeck.getSize(); i++) {
                if (playerdDeck.isContain(checkDeck.getCard(i))) {
                    outputStr.append(1);
                }
                else {
                    outputStr.append(0);
                }
                outputStr.append(" ");
            }
            return outputStr.toString().trim();
        }   
        
    }
}