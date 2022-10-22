public class SquarSpace {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {// rows
            for (j = 1; j <= 5; j++) {// column
                if (i == 1 || i == 5 || j == 1 || j == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
