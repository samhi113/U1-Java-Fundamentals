public class SalesTax {

    /*
    Create a program which takes a quantity, price, and tax percentage and outputs the subtotal, tax total, and total cost with tax.
     */

    public static void main(String[] args) {
        String item = "Hexbox Series Y";
        int quantity = 4;
        double pricePerItem = 499.99;
        double taxPercentage = 7;
        double moneyTendered = 2500.00;

        double subtotal = quantity * pricePerItem;
        double taxTotal = subtotal * (taxPercentage/100);
        double totalCost = subtotal + taxTotal;
        double balanceDue = totalCost - moneyTendered;

        System.out.println("Sam's Club?");
        System.out.println(quantity + "   " + item + "s   @   $" + pricePerItem);
        System.out.println("                           $" + pricePerItem*quantity);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: " + taxPercentage + "%   $" + taxTotal);
        System.out.println("Final Total: $" + totalCost);
        System.out.println("Money Tendered: $" + moneyTendered);
        System.out.println("Balance Due: $" + balanceDue);
    }

}
