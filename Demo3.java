import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int size, i;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size of array");
        size = r.nextInt();
        int a[] = new int[size];

        for (i = 0; i < size; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("Printed array element");
        for (i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }

}
