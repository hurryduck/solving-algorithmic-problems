package problems;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2558 {
    public static void main(String[] args) throws Exception {
        new _2558().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(br.readLine());
        int b = Integer.valueOf(br.readLine());
        
        System.out.println(sum(a, b));
    }

    private int sum(int a, int b) {
        return a + b;
    }
    
}
