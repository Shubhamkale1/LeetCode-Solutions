package oops.polymorphism;

class A {
    private void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

public class Program1 {

    public static void main(String[] args) {

        A obj = new A();
        //obj.show();
        // can not override private method

    }
}
