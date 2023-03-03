public class Employee extends Person {
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employee(String name, int age, String company) {
        super(name, age);
        setCompany(company);
    }

    public String toString() {
        return String.format("(%s, %d, %s)", super.getName(), super.getAge(), this.company); 
    }

    @Override
    public String work() {
        return "Manager";
    }
}
