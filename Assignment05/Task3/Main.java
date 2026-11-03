// Name: ____________________   Roll No: ____________
// Assignment 5: Linear Search
// Task 3: Count occurrences of 52 in {52, 10, 52, 7, 52}

public class Main {
    public static void main(String[] args) {
        int[] a = {52, 10, 52, 7, 52};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
