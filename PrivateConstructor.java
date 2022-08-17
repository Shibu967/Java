public class PrivateConstructor {
    int a;
    double b;
    String c;

    private PrivateConstructor() {
        a = 34556;
        b = 30.56;
        c = "shibu";
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {

        PrivateConstructor r = new PrivateConstructor();

    }

}
