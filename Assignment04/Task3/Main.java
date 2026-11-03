// Name: ____________________   Roll No: ____________
// Assignment 4: Selection Sort
// Task 3: First step of selection sort only

public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int minIdx = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIdx]) {
                minIdx = i;
            }
        }
        int t = a[0];
        a[0] = a[minIdx];
        a[minIdx] = t;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
