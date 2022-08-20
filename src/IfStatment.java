public class IfStatment {

    public static void main(String[] args) {

//          OPERATORY MATEMATYCZNE
//         + dodaje 2 liczby
//         - odejmuje dwie liczby
//         * znak mnożenia
//         / dzielenie całkowite
//         % (modulo) reszta z dzielenia

//          OPERATORY LOGICZNE
//         == sprawdza równość
//         != różny
//         >= większy równy
//         <= mniejszy równy
//         >,< większy, mniejszy

    }


    //  If "cloth" is "hoodie" and "price" lower then 200 then print "should buy",
    //  otherwise print "shouldn't buy"
    public static void shouldBuyClothOrNot(String cloth, int price){

        if(cloth.toLowerCase().equals("hoodie") && price < 200){
            System.out.println("should buy");
        } else {
            System.out.println("shouldn't buy");
        }
    }


    //  If "cloth" is "hoodie" and "color" is "green" and "price" lower then 200 then return true,
    //  otherwise return false
    public static boolean clothTrueOrFalse(String cloth, String color, int price){
        return cloth.toLowerCase().equals("hoodie") && color.toLowerCase().equals("green") && price < 200;
    }


    //  If "cloth" is "jacket" or "cloth" is "shirt" and "price" lower then 200 then return true,
    //  otherwise return false
    public static boolean ifClothJacketOrShirt(String cloth, int price){
        return cloth.toLowerCase().equals("jacket") || cloth.toLowerCase().equals("shirt") && price < 200;
    }


    //return true if given number is even, otherwise return false.
    public static boolean isEven(int i) {
        return i%2 == 0;
    }


    //if given number is dividable by 3 print "{i} is dividable by 3"
    //if given number is dividable by 4 print "{i} is dividable by 4"
    //if given number is dividable by 5 print "{i} is dividable by 5"
    //if given number is dividable by 9 print "{i} is dividable by 9"
    // otherwise print "{i} is not dividable by 3/4/5/9"
    public static void printDividers(int i) {
        if(i%3 != 0 && i%4 != 0 && i%5 != 0 && i%9 != 0){
            System.out.println(i + " is not dividable by 3/4/5/9");
        } else
        if(i%3 == 0){
            System.out.println(i + " is dividable by 3");
        } if(i%4 == 0){
            System.out.println(i + " is dividable by 4");
        } if(i%5 == 0){
            System.out.println(i + " is dividable by 5");
        } if(i%9 == 0){
            System.out.println(i + " is dividable by 9");
        }

    }


    //return true if any of parameters is equal to 15,
    //or if sum is equal to 15,
    //or if difference is equal to 15,
    //otherwise return false;
    public static boolean is15Here(int a, int b) {
        return a == 15 || b == 15 || a+b == 15 || Math.abs(a-b) == 15;
    }

    //codingBat
}
