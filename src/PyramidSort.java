/**
 * Created by pdv on 17.05.2016.
 */
public class PyramidSort {

    /**
     * Размер кучи. Изначально равен размеру сортируемого массива
     */
    private static int heapSize;

    public static <E extends Comparable<E>> void sort(E[] arr) {
        buildHeap(arr);
        while (heapSize > 1) {
            swap(arr, 0, heapSize - 1);
            heapSize--;
            heapify(arr, 0);
        }
    }

    /**
     * Построение кучи. Поскольку элементы с номерами начиная с a.length / 2 + 1
     * это листья, то нужно переупорядочить поддеревья с корнями в индексах
     * от 0 до a.length / 2 (метод heapify вызывать в порядке убывания индексов)
     *
     * @param arr - массив, из которого формируется куча
     */
    private static <E extends Comparable<E>> void buildHeap(E[] arr) {
        heapSize = arr.length;
        for (int i = arr.length / 2; i >= 0; i--) {
            heapify(arr, i);
        }
    }

    /**
     * Переупорядочивает поддерево кучи начиная с узла i так, чтобы выполнялось
     * основное свойство кучи - a[parent] >= a[child].
     *
     * @param arr - массив, из которого сформирована куча
     * @param i - корень поддерева, для которого происходит переупорядосивание
     */
    private static <E extends Comparable<E>> void heapify(E[] arr, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && arr[i].compareTo(arr[l]) > 0) {
            largest = l;
        }
        if (r < heapSize && arr[largest].compareTo(arr[r]) > 0) {
            largest = r;
        }
        if (i != largest) {
            swap(arr, i, largest);
            heapify(arr, largest);
        }
    }

    /**
     * Возвращает индекс правого потомка текущего узла
     *
     * @param i индекс текущего узла кучи
     * @return индекс правого потомка
     */
    private static int right(int i) {
        return 2 * i + 1;
    }

    /**
     * Возвращает индекс левого потомка текущего узла
     *
     * @param i индекс текущего узла кучи
     * @return индекс левого потомка
     */
    private static int left(int i) {
        return 2 * i + 2;
    }

    /**
     * Меняет местами два элемента в массиве
     *
     * @param a массив
     * @param i индекс первого элемента
     * @param j индекс второго элемента
     */
    private static <E extends Comparable<E>> void swap(E[] a, int i, int j) {
        E temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
