public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */

    public static void main(String[] args) {
        double originalCost = 60.00;
        double percentageOff = 0.20;

        double newCost = originalCost * (1-percentageOff);

        System.out.println("A " + originalCost + " game on sale for " + percentageOff*100 + "% off will cost");
        System.out.println("$" + newCost);
    }
}
