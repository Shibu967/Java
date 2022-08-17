class A {
    int a;
    String b;

    A() {
        a = 10;
        b = "shibu";
        System.out.println(a + " " + b);

    }

    A(A ref)

    {

        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }

}

public class CopyConstructor {

    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(r);

    }
}
