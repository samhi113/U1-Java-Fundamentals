public class L3 {

    //add the main method header below.

    /*
    Literal value is directly written in the code
    Expressions are written to go with variables or operators
     */
    public static void main(String[] args) {
        int literalval = 5;
        int expression = 2*(3+literalval);
        System.out.println("If literalval is " + literalval + ",");
        System.out.println("Then the expression evaluates to " + expression + ".");

        //Examples of Literal Values
        double literalExample1 = 3.4;
        boolean literalExample2 = true;
        String literalExample3 = "Apple";

        //Examples of Expressions
        double expressionExample1 = 5 + 6;
        boolean expressionExample2 = 5 > 6;

        //bad example
        /*
        int badExample = 5.4 + 9;
         */

        //A String expression is called String concatenation. You can combine Strings using the +.
        String expressionExample3 = "A fruit people eat is an " + literalExample3;

        //Example Program
        String message1 = "The store has ";
        String message2 = " apples in stock.";
        int numApples = 20;

        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples in stock");
        System.out.println(message1 + numApples + message2);

    }
}
