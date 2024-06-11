package rank.silver.v;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class _1308 {
    public static void main(String[] args) throws Exception {
        new _1308().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStrSplit = br.readLine().split(" ");
        int year = Integer.parseInt(inputStrSplit[0]);
        int month = Integer.parseInt(inputStrSplit[1]);
        int day = Integer.parseInt(inputStrSplit[2]);
        LocalDate startDate = LocalDate.of(year, month, day);

        inputStrSplit = br.readLine().split(" ");
        year = Integer.parseInt(inputStrSplit[0]);
        month = Integer.parseInt(inputStrSplit[1]);
        day = Integer.parseInt(inputStrSplit[2]);
        LocalDate endDate = LocalDate.of(year, month, day);

        if (endDate.isEqual(startDate.plusYears(1000)) || endDate.isAfter(startDate.plusYears(1000))) {
            System.out.println("gg");
        } else {
            long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
            System.out.println("D-" + daysBetween);
        }
    }
}