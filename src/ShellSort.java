/**
 * Created by pdv on 17.05.2016.
 */
public class ShellSort {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        int increment = arr.length / 2;
        while (increment > 0) {
            for (int i = increment; i < arr.length; i++) {
                int j = i;
                E temp = arr[i];
                while (j >= increment && arr[j - increment].compareTo(temp) < 0) {
                    arr[j] = arr[j - increment];
                    j = j - increment;
                }
                arr[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }

}
