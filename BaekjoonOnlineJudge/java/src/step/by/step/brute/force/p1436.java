package step.by.step.brute.force;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;


public class p1436 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        
        int[] numArr = IntStream.rangeClosed(666, 2700000).toArray();
        int[] endNumArr = Arrays.stream(numArr)
            .filter(num -> String.valueOf(num).contains("666"))
            .toArray();
        
        System.out.println(endNumArr[n - 1]);
    }
    
    public static void main(String[] args) throws Exception{
        new p1436().solution();
    }
}
