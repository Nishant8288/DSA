// Name: ____________________   Roll No: ____________
// Assignment 10: Parent and Child Classes
// Task 2: Student extends Person using super(name)

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Neha");
        System.out.println("Name: " + s.name);
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}
