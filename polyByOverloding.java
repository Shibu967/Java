public class polyByOverloding {
    void add() {
        int a = 45, b = 34, c;
        c = a + b;
        System.out.println(c);

    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);

    }

    void add(int x, double y) {
        double c;
        c = x + y;
        System.out.println(c);

    }

    public static void main(String[] args) {
        polyByOverloding r = new polyByOverloding();
        r.add();
        r.add(100, 300);
        r.add(50, 45.45);

    }
}
