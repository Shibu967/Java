public class AvgOfNutural {
    public static void main(String[] args) {
        int n = 10;
        int avg = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            avg = sum / n;

        }
        System.out.println(avg);
    }

}
