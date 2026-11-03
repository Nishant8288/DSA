// Name: ____________________   Roll No: ____________
// Assignment 4: Selection Sort
// Task 1: Index of the smallest value in {64, 25, 12, 22, 11}

public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int minIdx = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIdx]) {
                minIdx = i;
            }
        }
        System.out.println(minIdx);
    }
}
