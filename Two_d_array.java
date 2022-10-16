public class Two_d_array {
    public static void main(String[] args) {
        int[][] a = { { 10, 20, 30, 40, 60 }, { 70, 80, 90, 100, 110, 120 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
