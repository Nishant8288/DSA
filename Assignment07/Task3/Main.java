// Name: ____________________   Roll No: ____________
// Assignment 7: Practice Set
// Task 3: Product of {2, 3, 4}

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int product = 1;
        for (int i = 0; i < a.length; i++) {
            product *= a[i];
        }
        System.out.println("Product: " + product);
    }
}
