import java.util.Scanner;

public class Fact {

    public static void main(String[] args) {
        int i;
        int a;
        int fact = 1;
        System.out.println("Enter the the number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        System.out.println("print the number:" + a);
        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }

}
