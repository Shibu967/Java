public class JaggedArray {
    public static void main(String[] args) {
        int[][] a = { { 10, 20, 30, 35 }, { 40, 58 }, { 70, 80, 90, 100, 120 } };
        System.out.println(a.length);// 3
        System.out.println(a[0].length);// 4
        System.out.println(a[1].length);// 2
        System.out.println(a[0].length);// 4
        System.out.println(a[0][0]);// 4

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}