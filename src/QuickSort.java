/**
 * Created by pdv on 11.05.2016.
 */
public class QuickSort {

    /*public static int ARRAY_LENGTH = 30;
    private static int[] array = new int[ARRAY_LENGTH];
    private static Random generator = new Random();

    public static void initArray() {
        for (int i=0; i<ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public static void printArray() {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = 0, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    public static void main(String[] args) {
        initArray();
        printArray();
        quickSort();
        printArray();
    }*/

    /*public static <E extends Comparable<E>> void sort(E[] arr,int start, int end) {
        if (start >= end || arr == null) return;
        int i = 0, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (arr[i].compareTo(arr[cur]) <= 0)) {
                i++;
            }
            while (j > cur && (arr[cur].compareTo(arr[j]) <= 0)) {
                j--;
            }
            if (i < j) {
                E temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        QuickSort.sort(arr, start, cur);
        QuickSort.sort(arr, cur + 1, end);
    }*/

    private static <E extends Comparable<E>> int make(E[] arr, int left, int right) {
        int i = left, j = right;
        E tmp;
        E pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i].compareTo(pivot) > 0) i++;
            while (arr[j].compareTo(pivot) < 0) j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int left, int right) {
        int index = make(arr, left, right);
        if (left < index - 1)
            sort(arr, left, index - 1);
        if (index < right)
            sort(arr, index, right);
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr,0,arr.length - 1);
    }

}
