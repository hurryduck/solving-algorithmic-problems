import java.util.Scanner;

public class p181949 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String aToUpperCase = a.toUpperCase();
        StringBuilder resultStr = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == aToUpperCase.charAt(i)) {
                resultStr.append(String.valueOf(a.charAt(i)).toLowerCase());
            } else {
                resultStr.append(aToUpperCase.charAt(i));
            }
        }

        System.out.println(resultStr);
        sc.close();
    }
}
