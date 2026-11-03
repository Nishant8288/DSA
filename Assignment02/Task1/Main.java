// Name: ____________________   Roll No: ____________
// Assignment 2: Largest, Smallest and Count
// Task 1: Largest value

public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Largest: " + max);
    }
}
