import java.util.Scanner;

public class SwitchStatment {
    public static void main(String[] args) {

    }


    //Print season based on given month
    //"Spring": March  to May
    //"Summer": June  to August
    //"Autumn": September to November
    //"Winter": December to February
    //In case of incorrect month print: "Incorrect month"
    //Correct months:
    //January
    //February
    //March
    //April
    //May
    //June
    //July
    //August
    //September
    //October
    //November
    //December
    public static void getSeason(String month) {
        switch (month.toLowerCase()) {
            case "march", "april", "may" -> System.out.println("Spring");
            case "june", "july", "august" -> System.out.println("Summer");
            case "september", "october", "november" -> System.out.println("Autumn");
            case "december", "january", "february" -> System.out.println("Winter");
            default -> System.out.println("Incorrect month");
        }
    }


    //Based on given grade return grade description
    //1-bad
    //2-not good
    //3-ok
    //4-good
    //5-excellent
    //in case of incorrect grade return null
    public static String returnGrade(int grade) {
        return switch (grade){
            case 1 -> "bad";
            case 2 -> "not good";
            case 3 -> "ok";
            case 4 -> "good";
            case 5 -> "excellent";
            default -> null;
        };
    }

//  ZADANIE DODATKOWE (POLECAM ZROBIĆ ;D)
//  (Musisz pomyśleć jaka odpwowiedź jest prawidłowa)
    //Using switch statement and Scanner class implement quiz. User should enter one of following answers: a,b,c or d after every question
    //In case of correct answer print "Correct!" and increment variable score;
    //In case of incorrect answer  print "Incorrect!" and DO NOT increment variable 'score';
    //In case of or answer different then a,b,c,d print "Answer not available!" and DO NOT increment variable 'score';
    //After quiz print user score
    //Tip: to increment int variable use ++ operator. For example i++ will increment variable i by 1.
    // int i =0;
    // i++        <<< now value of i is 1
    // i++        <<< now value of i is 2
    public static void startQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        //Question 1
        System.out.println("Which primitive types represents integral numbers?");
        System.out.println("a. int,float,short,long");
        System.out.println("b. int,short,byte,double");
        System.out.println("c. int,byte,short,long");
        System.out.println("d. float,long,short,byte");
        System.out.println();
        System.out.println("Enter your choice: ");

        String answer1 = scanner.next();


        //Question 2
        System.out.println("Assuming x is int variable, how to correctly write 'if' statement?");
        System.out.println("a. if(1) {}");
        System.out.println("b. if(x=1) {}");
        System.out.println("c. if(x==true) {}");
        System.out.println("d. if(x==1) {}");
        System.out.println();
        System.out.println("Enter your choice: ");


        //Question 3
        System.out.println("String is not:");
        System.out.println("a. an object");
        System.out.println("b. representing text type");
        System.out.println("c. a primitive type");
        System.out.println("d. all answers are correct");
        System.out.println();
        System.out.println("Enter your choice: ");


        //Question 4
        System.out.println("What is the size of double type in Java?");
        System.out.println("a. 8 bit");
        System.out.println("b. 16 bit");
        System.out.println("c  32 bit");
        System.out.println("d. 64 bit");
        System.out.println();
        System.out.println("Enter your choice: ");


    }

}
