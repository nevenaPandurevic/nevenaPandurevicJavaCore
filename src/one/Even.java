package one;


import javax.swing.*;

public class Even {
    public static void main(String[] args) {
        String numText = JOptionPane.showInputDialog("Enter number ");
        int num = Integer.parseInt(numText);
        System.out.println("Entered number is " + num);
        System.out.println("Number is even " + (num % 2 == 0));
    }
}
