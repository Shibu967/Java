public class ReverseNumberExample1 {
    public static void main(String[] args) {
        int n = 123;
        int rev = 0;
        int remaindaer;
        while (n != 0) {
            remaindaer = n % 10;
            rev = rev * 10 + remaindaer;
            n = n / 10;
        }
        System.out.println(rev);
    }

}
