class student {
    int roll, marks;
    String name;

    void input() {
        System.out.println("Enter roll name & marks: ");
    }

}

class Shibu extends student {
    void disp() {

        roll = 1;
        name = "Shibu";
        marks = 89;
        System.out.println(roll + " " + name + " " + marks);
    }

    public static void main(String[] args) {
        Shibu r = new Shibu();
        r.input();
        r.disp();
    }

}