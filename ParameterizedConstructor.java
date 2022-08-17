class A {
    int x, y;

    A(int a, int b)// parameterized
    {
        x = a;
        y = b;
    }

    void Disp() {
        System.out.println(x + " " + y);
    }

}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        A r = new A(100, 300);
        r.Disp();
    }

}
