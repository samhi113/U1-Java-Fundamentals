import java.util.Scanner;

public class L8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        /*
        String name;
        double hours;
        double payRate;
        double grossPay;

        //Create a Scanner object to read input
        //Scanner read = new Scanner(System.in);

        //Get the user's name
        System.out.println("What is your name?");
        name = read.nextLine();

        //Get the number of hours worked
        System.out.println("How many hours did you work? (Enter as XX.X)");
        hours = read.nextDouble();

        //Get the user's hourly rate
        System.out.println("What is your hourly pay rate?");
        payRate = read.nextDouble();

        //Calculate the gross pay
        grossPay = Math.round(hours * payRate * 100)/100;

        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);
        */

        /*Bugaboo 1 - Hanging carriage
        int age;
        String name;
        int gradYear;

        System.out.println("What's your name?");
        name = read.next();

        System.out.println("What's your age?");
        age = read.nextInt();

        System.out.println("What year will/have you graduate(d)?");
        gradYear = read.nextInt();

        read.nextLine(); //Eats up hanging carriage return

        System.out.println("Hello " + name + ", class of " + gradYear + ", you are " + age + " years old.");
         */

        //Bugaboo 2 - Tokens
        String firstName;
        String lastName;
        String age;

        System.out.println("What is your full name with age?");
        firstName = read.next();
        lastName = read.next();
        age = read.nextLine();

        System.out.println("Hello " + firstName + " " + lastName + ". You are " + age + " years old.");
    }
}
