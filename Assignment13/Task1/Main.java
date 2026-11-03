// Name: ____________________   Roll No: ____________
// Assignment 13: Recursion on Arrays
// Task 1: Recursive array sum


public class Main {
    static int sum(int[] a, int i) {
        if (i == a.length) {
            return 0;
        }
        return a[i] + sum(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(sum(a, 0));
    }
}
