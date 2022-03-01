package my.calculator;

public class Arguments {
//Abstract level 2
    int num1;
    int num2;
    String operation;

    public Arguments(int firstNum, String operation, int secondNum) {
        this.num1 = firstNum;
        this.num2 = secondNum;
        this.operation = operation;
    }
}
