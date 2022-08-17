class A {
    int a;
    String name;

    A()// this is constructor
    {
        a = 34;
        name = null;
    }

    void show()// this is normal method
    {
        System.out.println(a + " " + name);
    }

}

public class Constructor {
    public static void main(String[] args) {
        A ref = new A();// object creataion
        ref.show();

    }

}
// this is constructor coding