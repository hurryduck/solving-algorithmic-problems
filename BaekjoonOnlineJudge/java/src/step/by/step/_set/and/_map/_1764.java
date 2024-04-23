package step.by.step._set.and._map;

import java.io.*;
import java.util.*;

public class _1764 {
    public static void main(String[] args) throws Exception {
        new _1764().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrSplit = br.readLine().split(" ");
        final int N = Integer.valueOf(inputStrSplit[0]);
        final int M = Integer.valueOf(inputStrSplit[1]);
        WhoPerson whoPerson = new WhoPerson();
        for (int i = 0; i < N; i++) {
            whoPerson.addHasntHeard(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            whoPerson.addHasntSeen(br.readLine());
        }
        whoPerson.sortHasntBothPerson();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(whoPerson.getHasntBothSize()));
        bw.newLine();
        for (int i = 0; i < whoPerson.getHasntBothSize(); i++) {
            bw.write(whoPerson.getHasntBothPerson(i));
            bw.newLine();
        }
        bw.flush();
    }

    private class WhoPerson {
        private Set<String> hasntHeard;
        private Set<String> hasntSeen;
        private List<String> hasntBoth;

        public WhoPerson() {
            this.hasntHeard = new HashSet<>();
            this.hasntSeen = new HashSet<>();
            this.hasntBoth = new ArrayList<>();
        }

        public void addHasntHeard(String name) {
            hasntHeard.add(name);
            if (hasntSeen.contains(name)) {
                hasntBoth.add(name);
            }
        }

        public void addHasntSeen(String name) {
            hasntSeen.add(name);
            if (hasntHeard.contains(name)) {
                hasntBoth.add(name);
            }
        }

        public void sortHasntBothPerson() {
            Collections.sort(hasntBoth);
        }

        public int getHasntBothSize() {
            return hasntBoth.size();
        }

        public String getHasntBothPerson(int index) {
            return hasntBoth.get(index);
        }
    }
}
