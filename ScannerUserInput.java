import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int x = sc.nextInt();
        System.out.println("The no is : " + x);
        sc.close();
    }
}
