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

        Element[] arr = Sort.fill(10000000, 10000000);
        //Element[] arr = Sort.fill(10, 10);
        Element[] arr1 = new Element[arr.length];
        Element[] arr2 = new Element[arr.length];
        Element[] arr3 = new Element[arr.length];
        Element[] arr4 = new Element[arr.length];
        Element[] arr5 = new Element[arr.length];
        Element[] arr6 = new Element[arr.length];
        Element[] arr7 = new Element[arr.length];
        long t0 = System.currentTimeMillis();
        System.arraycopy(arr,0,arr1,0,arr.length);
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.arraycopy(arr,0,arr3,0,arr.length);
        System.arraycopy(arr,0,arr4,0,arr.length);
        System.arraycopy(arr,0,arr5,0,arr.length);
        System.arraycopy(arr,0,arr6,0,arr.length);
        System.arraycopy(arr,0,arr7,0,arr.length);
        long t1 = System.currentTimeMillis();
        //CombSort.sort(arr1);
        //boolean r1 = Sort.checkOutAsc(arr1);
        long t2 = System.currentTimeMillis();
        //BubbleSort.sort(arr2);
        //boolean r2 = Sort.checkOutAsc(arr2);
        long t3 = System.currentTimeMillis();
        //SelectionSort.sort(arr3);
        //boolean r3 = Sort.checkOutAsc(arr3);
        long t4 = System.currentTimeMillis();
        QuickSort.sort(arr4);
        boolean r4 = Sort.checkOutAsc(arr4);
        long t5 = System.currentTimeMillis();
        //ShellSort.sort(arr5);
        //boolean r5 = Sort.checkOutAsc(arr5);
        long t6 = System.currentTimeMillis();
        //PyramidSort.sort(arr6);
        //boolean r6 = Sort.checkOutAsc(arr6);
        long t7 = System.currentTimeMillis();
        MergeSort.sort(arr7);
        boolean r7 = Sort.checkOutAsc(arr7);
        long t8 = System.currentTimeMillis();
        if (/*r1 &&*/ r4 && /*r5 && r6 &&*/ r7) {
            System.out.println("Elapsed time of copying arrays = " + (t1 - t0));
            System.out.println("Elapsed time of comb sort = " + (t2 - t1));
            System.out.println("Elapsed time of bubble sort = " + (t3 - t2));
            System.out.println("Elapsed time of selection sort = " + (t4 - t3));
            System.out.println("Elapsed time of quick sort = " + (t5 - t4));
            System.out.println("Elapsed time of shell sort = " + (t6 - t5));
            System.out.println("Elapsed time of pyramid sort = " + (t7 - t6));
            System.out.println("Elapsed time of merge sort = " + (t8 - t7));
        }
    }

}
