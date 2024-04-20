package step.by.step._set.and._map;

import java.io.*;
import java.util.*;

public class _7785 {
    public static void main(String[] args) throws Exception {
        new _7785().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        Map<String, String> members = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputStrSplit = br.readLine().split(" ");
            members.put(inputStrSplit[0], inputStrSplit[1]);
        }

        List<String> stayMembers = new ArrayList<>();
        for (Map.Entry<String, String> member : members.entrySet()) {
            if (member.getValue().equals("enter")) {
                stayMembers.add(member.getKey());
            }
        }

        Collections.sort(stayMembers, Collections.reverseOrder());

        for (String member : stayMembers) {
            bw.write(member);
            bw.newLine();
        }
        bw.flush();
    }
}