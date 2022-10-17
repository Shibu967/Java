import java.util.Set;
import java.util.HashSet;

public class FindDuplicateElements2 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 3, 2, 2, 1 };
        System.out.print("Duplicate elements are: ");
        Set<Integer> s = new HashSet<>();
        for (int no : arr) {
            if (s.add(no) == false) {
                System.out.print(no + " ");
            }
        }
    }

}
