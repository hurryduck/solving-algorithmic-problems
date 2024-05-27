package rank.bronze.i;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class _1037 {
    public static void main(String[] args) throws Exception {
        new _1037().solution();
    }

    private void solution() throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String[] inputStrSplit = br.readLine().split(" ");

        Set<Integer> divisorSet = new HashSet<>();
        for (String inputStr : inputStrSplit) {
            divisorSet.add(Integer.parseInt(inputStr));
        }

        int max = Collections.max(divisorSet);
        int min = Collections.min(divisorSet);

        System.out.println(max * min);
    }
}
