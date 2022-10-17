public class SearchMax {
    public static void main(String[] args) {
        int[] a = { 4, 3, 5, 2, 1, 6 };
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("maximum element is " + max);
    }

}
