public class ShortCircuting {
    public static void main(String[] args) {

        // initializing variables
        int a = 10, b = 20, c = 15;

        // displaying b
        System.out.println("Value of b : " + b);

        // Using logical AND
        // Short-Circuiting effect as the first condition is
        // false so the second condition is never reached
        // and so ++b(pre increment) doesn't take place and
        // value of b remains unchanged
        if ((a > c) && (++b > c)) {
            System.out.println("Inside if block");
        }

        // displaying b
        System.out.println("Value of b : " + b);
    }

}
