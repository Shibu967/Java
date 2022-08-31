public class ReverseArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 90;
        a[1] = 80;
        a[2] = 40;
        a[3] = 50;
        a[4] = 30;
        for (int i = 5 - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }

}
