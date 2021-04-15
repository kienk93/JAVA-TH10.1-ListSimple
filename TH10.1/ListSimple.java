package TH10;

public class ListSimple<E> {
    private int size = 0;
    private static final int Capacity = 10;
    private Object elements[];

    public ListSimple() {
        elements = new Object[Capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }


}