public class Animal3 {
    void eat() {
        System.out.println("i am eating");
    }
}

class Dog extends Animal3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
