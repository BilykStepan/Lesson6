import java.util.Scanner;

public class RateDefinition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of attempts:");
        int attempt = input.nextInt();
        for (int i = 0; i < attempt; i++) {
            System.out.println("Enter the number which rate you want to find:");
            int number = input.nextInt();
            if (number < 0) {
                System.out.println("Negative number");
            } else if (number == 0) {
                System.out.println("Zero");
            } else if (number < 10) {
                System.out.println("Array 0-10");
            } else if (number < 100) {
                System.out.println("Array 10-100");
            } else if (number < 1000) {
                System.out.println("Array 100-1000");
            } else if (number < 10000) {
                System.out.println("Array 1000-10'000");
            } else if (number < 100000) {
                System.out.println("Array 10'000-100'000");
            } else if (number < 1000000) {
                System.out.println("Array 100'000-1'000'000");
            } else {
                System.out.println("Wow it's huge :O");
            }
        }
    }
}
/*
    public static void lessonExample(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (getRate(number)){
        case 1 -> System.out.println("Tens");
        case 2 -> System.out.println("Hundreds");
        case 3 -> System.out.println("Thousands");
        case 4 -> System.out.println("Tens of thousands");
        case 5 -> System.out.println("Hundreds of thousands");
        case 6 -> System.out.println("Millions");
        default -> System.out.println("Unknown");
        }
    }
    private static int getRate(int number) {
        int counter = 0;
        while (number % 10 == 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }
*/