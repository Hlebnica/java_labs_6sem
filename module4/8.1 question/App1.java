import java.util.ArrayList;
import java.util.Scanner;

public class App1 {
    static class Student implements Comparable<Student> {
        public int id;
        public int score;

        public Student(int id, int score) {
            this.id = id;
            this.score = score;
        }

        @Override
        public int compareTo(Student o) {
            int res = 0;
            if (this.score < o.score)
                res = 1;
            else if (this.score > o.score)
                res = -1;
            else {
                if (this.id > o.id)
                    res = 1;
                else if (this.id < o.id)
                    res = -1;
            }

            return res;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            int score = in.nextInt();

            students.add(new Student(id, score));
        }
        in.close();

        students.sort((a, b) -> a.compareTo(b));
        for (Student student : students) {
            System.out.println(student.id + " " + student.score);
        }
    }
}
