class A// super class
{
    int a, b, c;

    void add() {

        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Sum of two Numbers: " + c);
    }

    void sub() {

        a = 100;
        b = 20;
        c = a - b;
        System.out.println("Sub of two Numbers: " + c);
    }

}

class B extends A// sub 1
{
    void Multi() {

        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Multi of two Numbers: " + c);
    }

    void div() {

        a = 100;
        b = 20;
        c = a / b;
        System.out.println("div of two Numbers: " + c);
    }

}

class C extends B// sub 2
{

    void rem() {

        a = 100;
        b = 21;
        c = a % b;
        System.out.println("rem of two Numbers: " + c);
    }

}

public class MulilevelInheritance {
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.Multi();
        r.div();
        r.rem();

    }

}
/* multi-level inheritance */