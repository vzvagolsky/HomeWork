import java.util.Arrays;
public class MyArrayCollection {


        private Object[] elements;
        private int size;
        private static  int DEFAULT_CAPACITY = 10;

        public static int getDefault() {
        return DEFAULT_CAPACITY;
         }

        public MyArrayCollection() {
            elements = new Object[getDefault()];
            size = 0;
        }

        public void add(Object element) {
            ensureCapacity();
            elements[size] = element;
            size++;
        }

        public void add(int index, Object element) {
            if (index < 0 || index > size) {
                System.out.println("Index is out of bounds");
                return;
            }
            ensureCapacity();
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Index is out of bounds");
                return;
            }
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }

            elements[--size] = null;

        }

        public int size() {
            return size;
        }

        private void ensureCapacity() {
            if (size == elements.length) {
                int newCapacity = elements.length * 2;
                elements = Arrays.copyOf(elements, newCapacity);
            }
        }

    @Override
    public String toString() {
        return "MyArrayCollection{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}




