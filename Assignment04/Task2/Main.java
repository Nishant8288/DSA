// Name: ____________________   Roll No: ____________
// Assignment 4: Selection Sort
// Task 2: Full selection sort

public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        for (int i = 0; i < a.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            int t = a[i];
            a[i] = a[minIdx];
            a[minIdx] = t;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
