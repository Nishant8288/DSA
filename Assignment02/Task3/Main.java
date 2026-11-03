// Name: ____________________   Roll No: ____________
// Assignment 2: Largest, Smallest and Count
// Task 3: Count values greater than 60

public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 60) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
