public class Arrays2 {
    public static void main(String[] args) {

    }



    //Given is an sorted array "ints".
    //Write solution that will return index in array "ints" of given element "value".
    //example: {1,3,7,8}, 8 -> 3
    //Given is an sorted array "ints".
    public static int getIndexOfSorted(int[] ints, int value) {
        int amountOfLoops = 1;
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Number of loop: " + amountOfLoops++);
            if(ints[i] == value){
                return i;
            }
        }
        return 0;
    }


    //Given is an sorted array "ints".
    //Write EFFICIENT solution that will return index in array "ints" of given element "value".
    //example: {1,3,7,8}, 8 -> 3
    //Given is an sorted array "ints".
    public static int getIndexOfSortedDivideAndWin(int[] ints, int value) {
        int startIndex = 0;
        int endIndex = ints.length - 1;

        if(ints[endIndex] == value){
            return endIndex;
        }

        int amountOfLoops = 1;
        while (true){
            System.out.println("Loop number: " + amountOfLoops++);
            int avgIndex = (startIndex + endIndex)/ 2;
            int midValue = ints[avgIndex];

            if(midValue == value){
                return avgIndex;
            }

            if(midValue < value){
                startIndex = avgIndex;
            }

            if(midValue > value){
                endIndex = avgIndex;
            }

        }
    }

    //program should print 2d array in following way:
    // {{"a","b"},{"c","d"}} ->
    // a,b
    // c,d
    public static void print2d(String[][] strings) {
        for (String[] s: strings) {
            for (String ss: s) {
                System.out.print(ss);
            }
            System.out.println("");
        }
    }


}
