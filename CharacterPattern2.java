public class CharacterPattern2 {
    public static void main(String[] args) {

        char i, j;
        for (i = 'A'; i <= 'E'; i++) {
            for (j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }

    }

}
