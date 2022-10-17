public class KthSmallestElement {
    public static void main(String[] args) {
        int[] a = { 5, 8, 12, 7, 6, 2, 4, 10, 21, 33 };
        int k = 4;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
            if (i == k - 1) {
                System.out.println(k + " smallest element is " + a[i]);
                break;
            }
        }
        System.out.println("--------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
