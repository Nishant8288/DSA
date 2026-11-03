// Name: ____________________   Roll No: ____________
// Assignment 12: Recursive Factorial, Sum and Power
// Task 1: Recursive factorial


public class Main {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
