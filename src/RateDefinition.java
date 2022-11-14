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
            } else if (number<100) {
                System.out.println("Array 10-100");
            } else if (number<1000) {
                System.out.println("Array 100-1000");
            } else if (number<10000) {
                System.out.println("Array 1000-10'000");
            } else if (number<100000) {
                System.out.println("Array 10'000-100'000");
            } else if (number<1000000) {
                System.out.println("Array 100'000-1'000'000");
            } else {
                System.out.println("Wow it's huge :O");
            }
        }
    }
}