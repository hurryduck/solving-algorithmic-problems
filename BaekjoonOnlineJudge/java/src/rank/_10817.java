package rank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10817 {
    public static void main(String[] args) throws Exception {
        new _10817().solution();
    }
    
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(br.readLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();
        Arrays.sort(numbers);
        System.out.println(numbers[1]);
    }
}