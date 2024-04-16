package step.by.step._sort;

import java.io.*;
import java.util.*;

public class _10814 {
    public static void main(String[] args) throws Exception {
        new _10814().solution();
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        Memeber[] members = new Memeber[n];
        for (int i = 0; i < members.length; i++) {
            members[i] = new Memeber(br.readLine(), i);
        }

        Arrays.sort(members, (m1, m2) -> {
            if (m1.getAge() == m2.getAge()) {
                return m1.getOrder() - m2.getOrder();
            }
            return m1.getAge() - m2.getAge();
        });

        for (Memeber memeber : members) {
            bw.write(memeber.getInfo());
        }
        bw.flush();
    }

    private class Memeber {
        private int age;
        private String name;
        private int order;

        public Memeber(String ageAndName, int order) {
            String[] splited = ageAndName.split(" ");
            this.age = Integer.valueOf(splited[0]);
            this.name = splited[1];
            this.order = order;
        }

        public int getAge() {
            return this.age;
        }

        public int getOrder() {
            return this.order;
        }

        public String getInfo() {
            return age + " " + name + "\n";
        }
    }
}
