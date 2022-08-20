package objectiveProgramming;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Maciej", "Nowak", 3000, 20, 20);
        Person person = new Person("Marek", "Kołodziejczyk");
        Student student = new Student("Karol", "Kowalski", 1000, 1000);

        double totalIncome = employee.getTotalIncome();
        double totalIncome1 = student.getTotalIncome();
        System.out.println(totalIncome);
        System.out.println(totalIncome1);
    }
}
