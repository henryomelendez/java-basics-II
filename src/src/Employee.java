public class Employee extends Person{
    private float salary;
    Employee(String firstName, String lastName, Byte age, Integer ssn, float salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }
    public void speak(){
        System.out.println("Enployee name: " + getFirstName() + " salary: " + this.salary);
    }
}
