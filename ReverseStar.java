public class ReverseStar {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {// rows
            for (j = 1; j < i; j++) {// space
                System.out.print(" ");
            }
            for (k = 5; k >= i; k--) {// column
                System.out.print("*");
            }
            System.out.print(" \n");
        }
    }

}
