package step.by.step._set.and._map;

import java.io.*;
import java.util.*;

public class _11478 {
    public static void main(String[] args) throws Exception {
        new _11478().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Subset subset = new Subset(br.readLine());

        System.out.println(subset.getSize());
    }

    private class Subset {
        private String originalStr;
        private Set<String> subSet;

        public Subset(String str) {
            this.originalStr = str;
            this.subSet = new HashSet<>();
            for (int i = 1; i <= str.length(); i++) {
                addSubset(i);
            }
        }

        public void addSubset(int size) {
            for (int i = 0; i <= this.originalStr.length() - size; i++) {
                subSet.add(this.originalStr.substring(i, i + size));
            }
        }

        public int getSize() {
            return this.subSet.size();
        }
    }
}
