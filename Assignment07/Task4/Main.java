// Name: ____________________   Roll No: ____________
// Assignment 7: Practice Set
// Task 4: Print even values of {1, 2, 3, 4}

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
