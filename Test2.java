public class Test2 {
    public static void main(String[] args) {
        boolean h1 = true;
        boolean h2 = false;
        boolean h3 = true;
        if (h1 & h2 | h2 & h3 | h2)
            System.out.println("tom");
        if (h2 & h2 | h2 & h3 | h2 | h1)
            System.out.println("jerry");

    }

}
