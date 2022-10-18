public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30 };
        int[] b = { 40, 50, 60, 70, 80 };

        int a_leng = a.length;
        int b_leng = b.length;
        int c_leng = a_leng + b_leng;
        int[] c = new int[c_leng];

        for (int i = 0; i < a_leng; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b_leng; i++) {
            c[a_leng + i] = b[i];
        }
        for (int i = 0; i < c_leng; i++) {
            System.out.print(c[i] + " ");
        }

    }

}
