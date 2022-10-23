public class String_rev {
    public static void main(String[] args) {
        String s = "Madam";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)

        {
            rev = rev + s.charAt(i);
        System.out.println(rev);
    }
}