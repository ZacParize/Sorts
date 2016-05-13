import element.Element;

/**
 *
 */
public class CombSort {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        int gap = arr.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + gap < arr.length) {
                if (arr[i].compareTo(arr[i + gap]) < 0) {
                    E tmp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = tmp;
                    swapped = true;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Element[] arr = Sort.fill(10000, 10000);
        Element[] arr1 = new Element[arr.length];
        Element[] arr2 = new Element[arr.length];
        Element[] arr3 = new Element[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.arraycopy(arr,0,arr3,0,arr.length);
        long t1 = System.currentTimeMillis();
        CombSort.sort(arr1);
        long t2 = System.currentTimeMillis();
        BubbleSort.sort(arr2);
        long t3 = System.currentTimeMillis();
        SelectionSort.sort(arr3);
        long t4 = System.currentTimeMillis();
        System.out.println("Elapsed time of comb sort = " + (t2-t1));
        System.out.println("Elapsed time of bubble sort = " + (t3-t2));
        System.out.println("Elapsed time of selection sort = " + (t4-t3));
    }

}
