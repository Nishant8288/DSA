// Name: ____________________   Roll No: ____________
// Assignment 11: Method Overriding
// Task 3: Runtime polymorphism with a Shape variable

public class Main {
    public static void main(String[] args) {
        Shape s = new Square(3);
        System.out.println("Area: " + s.area());
    }
}

class Shape {
    int area() {
        return 0;
    }
}

class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    int area() {
        return side * side;
    }
}
