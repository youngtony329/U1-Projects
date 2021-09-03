import jdk.nashorn.internal.scripts.JO;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Sales {
    public static void main(String[] args) {

        int discount, salesTax;
        double taxTotal, finalTotal, subTotal,price,quantity, total,discountPrice;

        DecimalFormat roundTo2 = new DecimalFormat("0.00");

        quantity = Double.parseDouble(JOptionPane.showInputDialog("How many are you buying?: "));
        price = Double.parseDouble(JOptionPane.showInputDialog("What is the sale price?: "));
        discount = Integer.parseInt(JOptionPane.showInputDialog("What is the discount?: "));
        salesTax = Integer.parseInt(JOptionPane.showInputDialog("What is the sales tax?; "));


        total =  price * quantity;
        discountPrice = total - ( total * discount / 100.0);
        taxTotal = price * salesTax/100;
        finalTotal = discountPrice + taxTotal;

        String num1 = roundTo2.format(total);
        String num2 = roundTo2.format(taxTotal);
        String num3 = roundTo2.format(finalTotal);


        JOptionPane.showMessageDialog(null, "Subtotal: $" + num1);
        JOptionPane.showMessageDialog(null, "Tax Total: $" + num2);
        JOptionPane.showMessageDialog(null, "Total Cost: $" + num3);

        System.exit(0);
    }

}
    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */