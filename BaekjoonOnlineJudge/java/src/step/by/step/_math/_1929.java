package step.by.step._math;

import java.io.*;

public class _1929 {
    public static void main(String[] args) throws Exception {
        new _1929().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrSplit = br.readLine().split(" ");
        
        int M = Integer.valueOf(inputStrSplit[0]);
        int N = Integer.valueOf(inputStrSplit[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = M; i <= N; i++) {
            if (isPrimeNum(i)) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
    }

        // isPrimeNum: 소수 여부 반환
        private boolean isPrimeNum(int num) {
            if (num < 2) { // 2보다 작은 소수는 없다.
                return false;
            }
    
            // 소수를 확인할 때에 약수 2승을 이상을 확인하는 것은 의미가 없다.
            for (long div = 2; div * div <= num; div++) { 
                if (num % div == 0) {
                    return false;
                }
            }
            return true;
        }
}
