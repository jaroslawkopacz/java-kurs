public class Arrays {

    public static void main(String[] args) {

    }


    //return maximum integer of array
    //Example: {-5,7,9,4} -> 9
    //Example: {1,3,4,5} -> 5
    public static int getMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }


    //return connected arrays
    //{"a", "b"}, {"c", "d"} -> {"a", "b", "c", "d"}
    public static String[] connectArrays(String[] a, String[] b){
        String[] strings = new String[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            strings[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            strings[i + a.length] = b[i];
        }
        return strings;
    }


    public static void printAll(String[] strings) {
        for (String s: strings) {
            System.out.println(s);
        }
    }


    //Find first even number in given array int[] ints. Return 0 if there is no even numbers.
    //example: {1,3,8,7}->8
    //use foreach loop
    public static int findFirstEven(int[] ints) {
        for (int i: ints) {
            if(i%2 == 0){
                return i;
            }
        }
        return 0;
    }


    //Map int[] to boolean[]. Program should map to "true" if the number is even, otherwise should map to "false".
    //example: {5,12,1,8}->{false, true, false, true}
    public static boolean[] areEven(int[] ints) {
        boolean[] booleans = new boolean[ints.length];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%2 == 0){
                booleans[i] = true;
            }
        }
        return booleans;
    }

}
