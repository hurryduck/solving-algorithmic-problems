package step.by.step._set.and._map;

import java.io.*;
import java.util.*;

public class _1620 {
    public static void main(String[] args) throws Exception {
        new _1620().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrSplit = br.readLine().split(" ");
        final int N = Integer.valueOf(inputStrSplit[0]);
        final int M = Integer.valueOf(inputStrSplit[1]);

        Pokedex pokedex = new Pokedex();
        for (int i = 0; i < N; i++) {
            pokedex.addPocketmon(br.readLine());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < M; i++) {
            String inputStr = br.readLine();
            try {
                int index =  Integer.parseInt(inputStr);
                bw.write(pokedex.getInfo(index));
            } 
            catch (NumberFormatException e) {
                bw.write(pokedex.getInfo(inputStr));
            }
            bw.newLine();
        }
        bw.flush();
    }

    private class  Pokedex {
        private Map<String, Integer> pokedexName;
        private Map<Integer, String> pokedexIndex;
        private int currentIndex;
        
        public Pokedex() {
            this.pokedexName= new HashMap<>();
            this.pokedexIndex= new HashMap<>();
            this.currentIndex = 1;
        }

        public void addPocketmon(String pokemon) {
            this.pokedexName.put(pokemon, this.currentIndex);
            this.pokedexIndex.put(this.currentIndex, pokemon);
            this.currentIndex++;
        }

        public String getInfo(String pokemon) {
            return String.valueOf(this.pokedexName.get(pokemon));
        }

        public String getInfo(int index) {
            return this.pokedexIndex.get(index);
        }
    }
}