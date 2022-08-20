package objectiveProgramming;

public class Student extends Person implements Profiable{
    private int scholarship;
    private int pocketMoney;

    public Student(String name, String surname, int scholarship, int pocketMoney) {
        super(name, surname);
        this.scholarship = scholarship;
        this.pocketMoney = pocketMoney;
    }

    public double getTotalIncome(){
        return scholarship + pocketMoney;
    }

}
