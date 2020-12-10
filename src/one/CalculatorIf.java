package one;

import javax.swing.*;
import java.util.Scanner;

public class CalculatorIf {
    public static void main(String[] args) {
        System.out.println("Enter first operand");
        double operand1 = new Scanner(System.in).nextDouble();
        System.out.println("Enter second operand");
        double operand2 = new Scanner(System.in).nextDouble();
        String operator = "-";
        if (operator.equals("+")){
            System.out.println("Result is " + (operand1 + operand2));
        } else if (operator.equals("-")) {
            System.out.println("Result is " + (operand1 - operand2));
        } else if (operator.equals("*")) {
            System.out.println("Result is " + (operand1 * operand2));
        } else if (operator.equals("/")) {
            System.out.println("Result is " + (operand1 / operand2));
        } else {
            System.out.println("Result is " + (operand1 % operand2));
        }
    }
}
