package step.by.step._set.and._map;

import java.io.*;
import java.util.*;

public class _1269 {
    public static void main(String[] args) throws Exception {
        new _1269().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        String[] inputStrSplit;

        inputStrSplit = br.readLine().split(" ");
        Set<Integer> aSet = new HashSet<>(); 
        for (int i = 0; i < inputStrSplit.length; i++) {
            aSet.add(Integer.valueOf(inputStrSplit[i]));
        } 

        inputStrSplit = br.readLine().split(" ");
        Set<Integer> bSet = new HashSet<>();
        for (int i = 0; i < inputStrSplit.length; i++) {
            bSet.add(Integer.valueOf(inputStrSplit[i]));
        }

        System.out.println(getDifferenceSize(aSet, bSet));
    }

    private int getDifferenceSize(Set<Integer> aSet, Set<Integer> bSet) {
        Set<Integer> aSetDifference = new HashSet<>(aSet);
        Set<Integer> bSetDifference = new HashSet<>(bSet);
        aSetDifference.removeAll(bSet);
        bSetDifference.removeAll(aSet);
        return aSetDifference.size() + bSetDifference.size();
    }
}
