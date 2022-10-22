public class ReverseNumber {
    public static void main(String[] args) {
        int n = 121;
        int Rev = 0;
        int r;
        while (n > 0) {
            r = n / 10;
            System.out.print(r);
            n = n / 10;
        }

    }
}