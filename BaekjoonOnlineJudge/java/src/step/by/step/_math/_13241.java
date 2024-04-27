package step.by.step._math;

import java.io.*;

public class _13241 {
    public static void main(String[] args) throws Exception {
        new _13241().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrSplit = br.readLine().split(" ");
        
        long a = Integer.valueOf(inputStrSplit[0]); // 정수 A
        long b = Integer.valueOf(inputStrSplit[1]); // 정수 B
        
        br.close();

        System.out.println(getSmallestCommonMultiple(a, b));
    }   

    // 최소공배수를 구하는 메소드
    private long getSmallestCommonMultiple(long a, long b) {
        return a * b / getGreatestCommonDivisor(a, b);
    }

    // 최대공약수를 구하는 메소드
    private long getGreatestCommonDivisor(long a, long b) {
        long largerNum;
        long smallerNum;
        if (a > b) { // a가 클 경우
            largerNum = a;
            smallerNum = b;
        }
        else if (a < b) { // b가 클 경우
            largerNum = b;
            smallerNum = a;
        }
        else { // a = b가 같을 경우
            return a;
        }

        while (smallerNum != 0) {
            long remainder = largerNum % smallerNum;
            largerNum = smallerNum;
            smallerNum = remainder;
        }

        return largerNum;
    }
}