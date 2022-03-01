package my.calculator;

import java.util.Scanner;

public class Main {
//Abstract level 1
    public static void main(String[] args) {
        while (true) {
            Arguments arguments = readArguments();
            doCalculation(arguments);
            checkExitOrContinue();
        }
    }

    private static Arguments readArguments() {
        System.out.println("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();

        System.out.println("Enter operation: ");
        String operation = scanner.next();

        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();

        return new Arguments(firstNum, operation, secondNum);
    }

    private static void doCalculation(Arguments args) {
        BasicCalculation basicCalculation = new BasicCalculation();
        final double result = basicCalculation.calculation(args.num1, args.num2, args.operation.charAt(0));

        System.out.println("Result of " + args.num1 + args.operation.charAt(0) + args.num2 + " is " + result);
    }

    private static void checkExitOrContinue() {
        System.out.print("Please enter [E] to exit or any key to continue: ");
        String command = new Scanner(System.in).next();
        if (command.equalsIgnoreCase("E")) {
            System.exit(0);
        }
    }
}

