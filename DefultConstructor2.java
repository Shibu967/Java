class A {
    int a;
    String b;
    boolean c;

    A() {// defult constructor
        a = 3456;
        b = "shibu";
        c = false;
    }

    void Disp() {
        System.out.println(a + " " + b + " " + c);
    }

}

public class DefultConstructor2 {
    public static void main(String[] args) {
        A r = new A();
        r.Disp();
    }

}
