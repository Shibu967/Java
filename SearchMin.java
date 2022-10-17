import java.time.chrono.MinguoDate;

import javax.sound.midi.MidiEvent;

public class SearchMin {
    public static void main(String[] args) {
        int[] a = { 4, 3, 5, 2, 1, 6 };
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("minmum element is " + min);
    }
}
