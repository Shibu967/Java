class A {
    int a;
    double b;
    String c;

    A() {
        a = 100;
        b = 45.67;
        c = "Shibu Kumari";
    }

    A(int x) {
        a = x;
    }

    A(double y, String z) {
        b = y;
        c = z;
    }

}

public class OverlodingConstructor {
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(10);
        A r3 = new A(34.67, "vipul");
        System.out.println(r.a + " " + r.b + " " + r.c);
        System.out.println(r2.a);
        System.out.println(+r3.b + " " + r3.c);

    }

}
