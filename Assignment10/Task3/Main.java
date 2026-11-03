// Name: ____________________   Roll No: ____________
// Assignment 10: Parent and Child Classes
// Task 3: Teacher extends Person with greet()

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Kiran";
        t.greet();
    }
}

class Person {
    String name;

    void greet() {
        System.out.println("Hello, " + name);
    }
}

class Teacher extends Person {
}
