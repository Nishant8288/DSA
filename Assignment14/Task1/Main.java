// Name: ____________________   Roll No: ____________
// Assignment 14: Sorted Check, Search and Fibonacci
// Task 1: Recursive isSorted


public class Main {
    static boolean isSorted(int[] a, int i) {
        if (i >= a.length - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return isSorted(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(isSorted(a, 0));
    }
}
