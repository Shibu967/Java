
class Student {

    String name;
    int age;

    public void printInfo() {

        System.out.println(this.name);
        System.out.println(this.age);
    }

    // now,perimeterconstructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

}

public class PerimeterConstructor {

    public static void main(String[] args) {
        Student s1 = new Student("vipul", 22);
        s1.printInfo();
    }
}
