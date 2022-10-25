public class ReplaceMethod {
    public static void main(String[] args) {
        String s1 = "This is Demo";
        System.err.println(s1.replace("is", "was"));
        System.out.println((s1.replaceFirst("is", "was")));
        System.out.println(s1.replaceAll("is", "was"));
    }

}
