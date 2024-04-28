package step.by.step._math;

import java.io.*;

public class _1735 {
    public static void main(String[] args) throws Exception {
        new _1735().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Fraction fraction1 = new Fraction(br.readLine()); // 분수객체1 생성
        Fraction fraction2 = new Fraction(br.readLine()); // 분수객체2 생성

        Fraction result = Fraction.sum(fraction1, fraction2); // 분수객체 출력
        result.print();
    }

    private static class Fraction {
        private int denominator; // 분자
        private int numerator; // 분모

        // 생성자: " "으로 구분되는 문자열 입력
        public Fraction(String str) {
            String[] strSplit = str.split(" ");
            this.denominator = Integer.valueOf(strSplit[0]);
            this.numerator = Integer.valueOf(strSplit[1]);
            simplify(); // 최대공약수를 구하여 간단화
        }

        public Fraction(int denominator, int numerator) {
            this.denominator = denominator;
            this.numerator = numerator;
            simplify();
        }

        // 최대공약수를 구하여 간단화
        private void simplify() {
            int gcd = getGreatestCommonDenominator(this.denominator, this.numerator);
            this.denominator /= gcd;
            this.numerator /= gcd;
        }

        // 최대공약수를 구하는 유클리드 호제법
        private int getGreatestCommonDenominator(int a, int b) {
            if (b == 0) {
                return a;
            }
            return getGreatestCommonDenominator(b, a % b);
        }

        // getter 분자
        public int getDenominator() {
            return this.denominator;
        }

        // getter: 분모
        public int getNumerator() {
            return this.numerator;
        }

        // 메소드: 분수 객체 출력
        public void print() {
            System.out.println(denominator + " " + numerator);
        }

        // 메소드: 분수를 더하기
        public static Fraction sum(Fraction f1, Fraction f2) {
            int newDenominator = f1.getDenominator() * f2.getNumerator() + f2.getDenominator() * f1.getNumerator();
            int newNumerator = f1.getNumerator() * f2.getNumerator();
            return new Fraction(newDenominator, newNumerator);
        }
    }
}
