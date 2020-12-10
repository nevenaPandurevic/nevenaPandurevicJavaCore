package two;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        System.out.println("Enter first operand ");
        double operand1 = new Scanner(System.in).nextDouble();
        System.out.println("Enter second operand ");
        double operand2 = new Scanner(System.in).nextDouble();
        String operator = "*";
        switch (operator) {
            case "+":
                System.out.println("Result is " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Result is " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Result is " + (operand1 * operand2));
                break;
            case "/":
                System.out.println("Result is " + (operand1 / operand2));
                break;
            case "%":
                System.out.println("Result is " + (operand1 % operand2));
                break;
            default:
                System.out.println("Operator is incorrect");
                break;
        }
    }
}
