public class ArrayPractice {
    public static void main(String[] args) {

        // Create a String array of four elements
        String[] myFourStrings = new String[4];

        // Fill the array
        myFourStrings[0] = "One";
        myFourStrings[1] = "Two";
        myFourStrings[2] = "Three";
        myFourStrings[3] = "Four";

        // output the array
        for (int i=0; i<4; i++) {
            System.out.println("\n i is " + i + " and myFourStrings[" + i + "] is: " + myFourStrings[i]);
        }
    }
}
