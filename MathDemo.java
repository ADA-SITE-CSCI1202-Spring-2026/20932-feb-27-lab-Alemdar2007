import java.util.Scanner;

public class MathDemo {

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static float mean(int[] args) {
        if (args.length == 0)
            return 0;
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative numbers not allowed");

        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Min: " + min(a, b));
        System.out.println("Max: " + max(a, b));

        System.out.print("How many numbers for array? ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sum: " + sum(arr));
        System.out.println("Mean: " + mean(arr));

        System.out.print("Enter number for factorial: ");
        int n = scanner.nextInt();

        System.out.println("Factorial: " + factorial(n));

        scanner.close();
    }
}
// Methods like min,max,sum and etc they belong to the class itself not the object if they are defined as static
