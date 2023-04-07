public class Student implements Comparable<Student>  {
    private final String name;
    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(student.grade, this.grade);
    }
}
