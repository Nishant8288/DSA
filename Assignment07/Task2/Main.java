// Name: ____________________   Roll No: ____________
// Assignment 7: Practice Set
// Task 2: Bubble sort {3, 1, 2}

public class Main {
    public static void main(String[] args) {
        int[] a = {3, 1, 2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
