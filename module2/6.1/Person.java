public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name =  name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("(%s, %d)", this.name, this.age);
    }

    public String work() {
        return "None";
    }
}
