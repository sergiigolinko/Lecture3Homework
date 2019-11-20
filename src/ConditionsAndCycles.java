import java.util.Scanner;

public class ConditionsAndCycles {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        decimalToBinary();
        int first = SCANNER.nextInt();
        int second = SCANNER.nextInt();
        System.out.println(algorithmEuclidean(first, second));
        anyToDecimal();

    }

    private static void decimalToBinary() {
        int decimal = SCANNER.nextInt();
        int binary = 0;
        for (int i = 0; decimal > 0; i++) {
            binary = binary + (decimal % 2) * (int) Math.pow(10, i);
            decimal = decimal / 2;
        }
        System.out.println(binary);

    }

    private static int algorithmEuclidean(int first, int second) {
        while (first != 0 && second != 0) {
            if (first > second) {
                first = first % second;
            } else {
                second = second % first;
            }
        }
        return first + second;
    }

    private static void anyToDecimal() {
        int calculatingSystem = SCANNER.nextInt();
        int digit = SCANNER.nextInt();
        int result = 0;
        int i = 0;
        while (digit > 0) {

            result = result + digit % 10 * (int) Math.pow(calculatingSystem, i++);
            digit = digit / 10;
        }
        System.out.println(result);
    }

}
