import org.w3c.dom.html.HTMLOptGroupElement;

import javax.swing.JOptionPane;

public class L9{
    public static void main(String[] args){
        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("What's your first name?");
        lastName = JOptionPane.showInputDialog("What's your last name?");

        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName + "!!");

        //ALL INPUT IS CONSIDERED STRING DATA

        //Pro Tip: Separate like data type variables on one line with a comma

        int mph, minutes;
        double hours, distance;

        mph = Integer.parseInt(JOptionPane.showInputDialog("What was your speed?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How many minutes did you travel?"));

        hours = minutes/60.0;

        distance = hours * mph;

        JOptionPane.showMessageDialog(null, "You traveled " + distance + " miles.");

        System.exit(0);
    }
}