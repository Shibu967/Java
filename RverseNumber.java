public class RverseNumber {
    public static void main(String[] args) {

        int n = 123;
        int rev = 0;
        for (int i = n.length() - 1; i >= 0; i--)

        {
            rev = rev + n.charAt(i);
        }
        System.out.println(rev);

    }
}
