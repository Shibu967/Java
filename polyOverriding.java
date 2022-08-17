class Shape {
    void draw() {

        System.out.println("Can not say shape type");
    }

}

class square extends Shape {
    @Override
    void draw() {

        System.out.println("square shape");
    }
}

public class polyOverriding {
    public static void main(String[] args) {
        Shape r = new square();
        r.draw();

    }

}
