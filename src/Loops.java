public class Loops {

    public static void main(String[] args) {

    }


    //Print numbers from 1 to 10
    public static void printNumbers(){
       for (int i = 1; i <= 10; i++){
           System.out.println(i);
       }
    }


    //return sum of numbers from 1 to 10
    public static int sumNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }


    //Print numbers from 1 to 10 with While loop
    public static void printNumbersWithWhile(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }


    //Print numbers from 1 to 10 with DoWhile loop
    public static void printNumbersWithDoWhile(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while (i <= 10);
    }


    //return sum of numbers from 1 to 10 with While loop
    public static int sumNumbersWhile() {
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum += i;
            i++;
        }
        return sum;
    }


    //Print all characters in String s in new line
    //example:
    //abcd ->
    //a
    //b
    //c
    //d
    //Tip1: use length() method to get size of string ("abc".length() will return 3)
    //Tip2: use charAt(int i) method to get N-th char of string ("abc".charAt(0) will return 'a')
    public static void printVertically(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }


    //Palindrome is a sequence of characters which reads the same backward as forward
    //Return true if given String is palindrome, return false otherwise.
    //Palindrome examples:
    //civic
    //stats
    //level
    //radar
    //Tip use method .charAt(n) to get n character of String.
    //Example:
    //"abcd".charAt(0) => 'a'
    //"abcd".chartAt(3) => 'd'
    //"abcd".chartAt(4) => Exception will be thrown, because there is no character on index 4 in String "abcd"
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
