/**
 *
 */
public class SelectionSort {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) > 0) {
                    min = j;
                }
            }
            E tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

}
