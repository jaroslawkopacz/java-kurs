package objectiveProgramming;

public class Employee extends Person implements Profiable{
    private int salary;
    private int overtime;
    private int rate;

    public Employee(String name, String surname, int salary, int overtime, int rate) {
        super(name, surname);
        this.salary = salary;
        this.overtime = overtime;
        this.rate = rate;
    }

    public double getTotalIncome(){
        return salary + (overtime * rate);
    }

}
