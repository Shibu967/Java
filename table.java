import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        int table;
        int a;

        System.out.println("Enter the the number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        System.out.println("print the number:" + a);
        for (int i = 1; i <= 10; i++) {
            table = a * i;
            System.out.print(table + " ");
        }

    }

}
