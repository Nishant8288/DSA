// Name: ____________________   Roll No: ____________
// Assignment 9: Constructors
// Task 2: Parameterised constructor using this

public class Main {
    public static void main(String[] args) {
        Box b = new Box(25);
        System.out.println("Width: " + b.width);
    }
}

class Box {
    int width;

    Box(int width) {
        this.width = width;
    }
}
