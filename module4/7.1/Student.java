public class Student implements Comparable<Student> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student(String name, int mark) {
        this.setName(name);
        this.setMark(mark);
    }

    @Override
    public int compareTo(Student s) {
        int result = Integer.compare(this.mark, s.getMark());

        if (result == 0) {
            result = this.name.compareTo(s.getName());
        }

        return result;
    }
}