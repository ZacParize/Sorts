package element;

/**
 *
 */

public class Element implements Comparable<Element> {

    private int value;

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Element element) {
        if (this.getValue() < element.getValue()) {
            return 1;
        } else if (this.getValue() > element.getValue()) {
            return -1;
        } else {
            return 0;
        }
    }

}
