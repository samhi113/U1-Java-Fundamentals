public class CountingCoins {

    /*
    Create a program which will make change, converting values of under $1 to their accurate quantity and type of coins.
    Example:   $0.51 -> 2 quarters and 1 penny.
     */

    public static void main(String[] args) {
        int cents = 659704367;
        double dollars = cents/100.00;

        int change = 0;

        int quarters = cents/25;
        change = cents % 25;

        int dimes = change / 10;
        change = change % 10;

        int nickels = change / 5;
        int pennies = change % 5;

        System.out.println("Change needed to make $" + dollars);
        System.out.println(quarters + " Quarters");
        System.out.println(dimes + " Dimes");
        System.out.println(nickels + " Nickels");
        System.out.println(pennies + " Pennies");
    }
}
