package rank.bronze.iv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class _2530 {
    public static void main(String[] args) throws Exception {
        new _2530().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();
        String[] timeParts = inputStr.split(" ");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);
        int second = Integer.parseInt(timeParts[2]);
        LocalTime curTime = LocalTime.of(hour, minute, second);

        int cookTime = Integer.parseInt(br.readLine()); 
        LocalTime displayTime = curTime.plusSeconds(cookTime);

        System.out.println(displayTime.getHour() + " " + displayTime.getMinute() + " " + displayTime.getSecond());
    }
}
