// Name: ____________________   Roll No: ____________
// Assignment 8: Classes and Objects
// Task 2: Student class with two objects

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 5;
        s1.name = "Rohan";
        Student s2 = new Student();
        s2.roll = 8;
        s2.name = "Meera";
        s1.show();
        s2.show();
    }
}

class Student {
    int roll;
    String name;

    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
