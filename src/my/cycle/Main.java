package my.cycle;

public class Main {

    static void tryWhile() {
        int i = 1;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }

    static void tryDoWhile() {
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }

    static void tryFor() {
        for (int i = 1; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }

    static double average(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
            sum += numbers[index];
        }
        System.out.println("sum = " + sum);
        double result = (double) sum / numbers.length;
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2};
        System.out.println(average(test1));

        int[] test2 = new int[3];
        System.out.println(average(test2));
    }
}