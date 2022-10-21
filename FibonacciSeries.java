public class FibnachiSeries {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int num = 10;
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

}