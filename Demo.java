public class Demo {
    void show(int a) {
        System.out.println("1");
    }

}

class xyz extends Demo {
    void show(int a) {
        System.out.println("2");

    }

    public static void main(String[] args) {
        // demo d = new demo();
        // d.show();
        xyz x = new xyz();
        x.show(45);
    }
}
