// Name: ____________________   Roll No: ____________
// Assignment 11: Method Overriding
// Task 2: Rectangle overrides area()

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 4;
        r.breadth = 5;
        System.out.println("Area: " + r.area());
    }
}

class Shape {
    int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    @Override
    int area() {
        return length * breadth;
    }
}
