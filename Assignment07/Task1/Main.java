// Name: ____________________   Roll No: ____________
// Assignment 7: Practice Set
// Task 1: Search for 52 in {45, 52, 80}

public class Main {
    public static void main(String[] args) {
        int[] a = {45, 52, 80};
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
