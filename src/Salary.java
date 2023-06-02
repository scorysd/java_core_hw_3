public class Salary extends Employe{
    double salary;

    public Salary(String name,double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    protected double calcPay() {
        return inPay = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
