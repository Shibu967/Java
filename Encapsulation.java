class A

{

    private int value;// data hiding

    public void setValue(int x)// data abstraction
    {
        value = x;

    }

    public int getValue() {
        return value;

    }
}

public class Encapsulation {
    public static void main(String[] args) {
        A r = new A();
        r.setValue(100);
        System.out.println(r.getValue());

    }

}
