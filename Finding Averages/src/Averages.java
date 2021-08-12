public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;
        int num3 = 4;
        int num4 = 27893;

        double averageNum = (num1+num2+num3+num4) / 4.0;
        System.out.println("The average of " + num1 + ", " + num2 + ", " + num3 + ", & " + num4 + " is");
        System.out.println(averageNum);
    }

}
