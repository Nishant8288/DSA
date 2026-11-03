// Name: ____________________   Roll No: ____________
// Assignment 12: Recursive Factorial, Sum and Power
// Task 2: Recursive sum of 1 to n


public class Main {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
