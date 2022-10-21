public class Animal2 {
    String color;
    int age;

    void initObj(String c, int a) {

        color = c;
        age = a;
    }

    void display() {
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        Animal2 Buzo = new Animal2();
        Buzo.initObj("black", 12);
        Buzo.display();

    }

}
// Object inialiation by using method