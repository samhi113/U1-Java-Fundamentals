public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */

    public static void main(String[] args) {
        int seconds = 1324567;

        int hours = seconds / 3600;
        int secondsLeft = seconds % 3600;
        int minutes = secondsLeft / 60;
        secondsLeft = secondsLeft % 60;

        System.out.println(seconds + " seconds is:");
        System.out.println(hours + " hours,");
        System.out.println(minutes + " minutes, and");
        System.out.println(secondsLeft + " seconds");
    }
}
