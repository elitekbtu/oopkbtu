package lab3.problem5;

public class Sort {

    static <E> void swap(E[] array, int i, int j) {
        E tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    static <E extends Comparable<E>> void bubbleSort(E[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - 1; j++)
                if (array[i].compareTo(array[j]) < 0)
                    swap(array, i, j);
    }

    static <E extends Comparable<E>> void selectionSort(E[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }
}
