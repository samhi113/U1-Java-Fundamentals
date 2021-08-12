public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */

    public static void main(String[] args) {
        int speed = 55;
        int minutes = 45;

        double hours = minutes / 60.0;
        double distance = hours * speed;

        System.out.println(speed + " mph for " + minutes + " minutes is");
        System.out.println(distance + " miles");
    }
}
