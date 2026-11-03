// Name: ____________________   Roll No: ____________
// Assignment 3: Bubble Sort
// Task 1: One pass of bubble sort on {5, 1, 4, 2, 8}

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                int t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
