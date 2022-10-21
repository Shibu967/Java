package Inheritance;

public class Simple {

    void Show() {
        System.out.println("Shibu");
    }

}

class B extends Simple {

    void ShowB() {
        System.out.println("Kumari");
    }

    public static void main(String[] args) {
        Simple s = new Simple();
        s.Show();
    }
}
