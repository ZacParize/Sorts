import element.Element;

/**
 *
 */
public class BubbleSort {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length /*- i*/ - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    E tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

}
