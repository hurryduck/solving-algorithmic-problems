package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1312 {
    public static void main(String[] args) throws Exception {
        new p1312().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] strSplit = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int a = strSplit[0]; // A
        int b = strSplit[1]; // B
        int n = strSplit[2]; // N

        int decimal = 0;
        for (int i = 0; i < n; i++) {
            a = a % b * 10;
            decimal = a / b;
        }
        
        System.out.println(decimal);
    }
}
