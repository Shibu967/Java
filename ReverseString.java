public class ReverseString {
    public static void main(String[] args) {
        int l;
        String a = "Shibu";
        String b = "";
        l = a.length();
        for (int i = l - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        System.out.println(b);
    }

}
