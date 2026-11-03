// Name: ____________________   Roll No: ____________
// Assignment 9: Constructors
// Task 3: Counter class

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        c.increment();
        c.increment();
        System.out.println("Count: " + c.count);
    }
}

class Counter {
    int count;

    Counter() {
        count = 0;
    }

    void increment() {
        count++;
    }
}
