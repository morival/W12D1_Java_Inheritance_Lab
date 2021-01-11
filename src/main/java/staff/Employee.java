package staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    public double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if(newName != null) {
            this.name = newName;
        }
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if(raise >0) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary / 100;
    }
}
