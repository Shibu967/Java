public class Test3 {

    void show(int a) {
        System.out.println("int method");
    }

    void show(String a) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        System.out.println("1");
        Test3 t = new Test3();
        t.show("a");

    }

}
