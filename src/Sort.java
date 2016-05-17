import element.Element;
import java.util.Random;

/**
 *
 */
public class Sort {

    public static Element[] fill (int size,int limit) {
        size = Math.abs(size);
        limit = Math.abs(limit);
        Element[] arr = new Element[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Element(random.nextInt(limit));
        }
        return arr;
    }

    public static boolean checkOutAsc(Element[] arr) {
        boolean result = true;
        int i = 0;
        while (result && (i < (arr.length - 1))) {
            if (arr[i].compareTo(arr[++i]) < 0) result = false;
        }
        return result;
    }

    public static void print(Element[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1)) {
                System.out.println(arr[i].getValue() + ",");
            } else {
                System.out.println(arr[i].getValue());
            }
        }
    }

}
