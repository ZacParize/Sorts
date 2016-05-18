/**
 * Created by pdv on 18.05.2016.
 */
public class MergeSort {

    public static <E extends Comparable<E>> void sort(E[] arr) {

        //If list is empty; no need to do anything
        if (arr.length <= 1) {
            return;
        }

        //Split the array in half in two parts
        @SuppressWarnings("unchecked")
        E[] first = (E[]) new Comparable[arr.length / 2];
        @SuppressWarnings("unchecked")
        E[] second = (E[]) new Comparable[arr.length - first.length];
        System.arraycopy(arr, 0, first, 0, first.length);
        System.arraycopy(arr, first.length, second, 0, second.length);

        //Sort each half recursively
        sort(first);
        sort(second);

        //Merge both halves together, overwriting to original array
        merge(first, second, arr);

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static <E extends Comparable<E>> void merge(E[] first, E[] second, E[] result)
    {
        //Index Position in first array - starting with first element
        int iFirst = 0;

        //Index Position in second array - starting with first element
        int iSecond = 0;

        //Index Position in merged array - starting with first position
        int iMerged = 0;

        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst].compareTo(second[iSecond]) > 0)
            {
                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}
