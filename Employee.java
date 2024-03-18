public class Employee extends Person {
    private int id;
    private double salary;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 1) {
            throw new Error("Salary must be a positive number");
        }
        this.salary = salary;
    }

    public double getFirstPaySalary() {
        return this.salary * 0.6;
    }

    public double getSecondPaySalary() {
        return this.salary * 0.4;
    }
}
