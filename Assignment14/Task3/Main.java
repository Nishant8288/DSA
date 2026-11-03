// Name: ____________________   Roll No: ____________
// Assignment 14: Sorted Check, Search and Fibonacci
// Task 3: Recursive Fibonacci


public class Main {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
