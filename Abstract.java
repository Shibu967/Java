
abstract class animal {
    public abstract void sound();// for common behavior

}

class dog extends animal {
    public void sound() {
        System.out.println("Dog is Barking");
    }
}

class lion extends animal

{
    public void sound() {
        System.out.println("lion is Roar");
    }

}

public class Abstract {
    public static void main(String[] args) {
        dog d = new dog();
        lion l = new lion();
        d.sound();
        l.sound();

    }

}
