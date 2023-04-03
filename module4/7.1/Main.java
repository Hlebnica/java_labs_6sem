import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet <Student> students = new TreeSet<>();

        students.add(new Student("Adda", 1));
        students.add(new Student("Brian", 1));
        students.add(new Student("Calvin", 2));
        students.add(new Student("Dexter", 2));
        students.add(new Student("Elon", 3));
        students.add(new Student("Frank", 3));
        students.add(new Student("George", 4));
        students.add(new Student("Helen", 4));
        students.add(new Student("Inga", 5));

        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        in.close();

        SortedSet<Student> result = students.tailSet(new Student("example", mark));
        for (Student student : result) {
            System.out.println(student.getName());
        }
    }
}
