// Name: ____________________   Roll No: ____________
// Assignment 11: Method Overriding
// Task 1: Square overrides area()

public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        s.side = 4;
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

    @Override
    int area() {
        return side * side;
    }
}
