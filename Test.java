
// Problem Statement
// Write a program using polymorphism in which a method calls different Classes.

class A {
    void m1(A a) {
        System.out.println("m1 method in class A");
    }
}

class B extends A {
    @Override
    void m1(A a) {
        System.out.println("m1 method in class B");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1(a); // Output: m1 method in class A

        a = new B();
        a.m1(new B()); // Output: m1 method in class B

        B b = new B();
        b.m1(null); // Output: m1 method in class B

        a = b;
        a.m1(null); // Output: m1 method in class B

        a.m1(new A()); // Output: m1 method in class A
    }
}
