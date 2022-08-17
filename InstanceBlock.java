class A

{
    int a, b;

    A() {
        a = 45;
        b = 48;
        System.out.println(a + " " + b);

    }

    {

        a = 10;
        b = 20;
        System.out.println(a + " " + b);
    }

}

public class InstanceBlock {
    public static void main(String[] args) {
        A r = new A();
    }

}
