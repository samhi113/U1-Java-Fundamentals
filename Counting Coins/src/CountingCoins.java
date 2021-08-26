public class CountingCoins {

    /*
    Create a program which will make change, converting values of under $1 to their accurate quantity and type of coins.
    Example:   $0.51 -> 2 quarters and 1 penny.
     */

    public static void main(String[] args) {
        double cents = 659704367.55;
        double dollars = cents/100.00;

        //Casting: (int)cents will be 659704367

        int change = 0;

        int quarters = (int)cents/25;
        change = (int)cents % 25;

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
