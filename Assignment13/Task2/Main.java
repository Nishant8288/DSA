// Name: ____________________   Roll No: ____________
// Assignment 13: Recursion on Arrays
// Task 2: Recursive array maximum


public class Main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }
        int rest = max(a, i + 1);
        return a[i] > rest ? a[i] : rest;
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(max(a, 0));
    }
}
