/**
 * Created by Olga on 13.04.2017.
 */

/**
 * Сортировка входного массива
 */
public class MergeSorting {

    /**
     * Алгоритм сортировки слиянием
     * @param items - входной массив
     */
    static public void mergeSort(long[] items) {
        // Если массив содержит один элемент - прервать выполнение метода

        if (items.length <= 1) {
            return;
        }

        int leftSize = items.length / 2;
        int rightSize = items.length - leftSize;
        long[] left = new long[leftSize];
        long[] right = new long[rightSize];

        System.arraycopy(items, 0, left, 0, leftSize);
        System.arraycopy(items, leftSize, right, 0, rightSize);

        // Рекурсивное деление массива

        mergeSort(left);
        mergeSort(right);

        Merge(items, left, right);

    }

    /**
     * Слияние
     * @param items
     * @param left
     * @param right
     */
    private static void Merge(long[] items, long[] left, long[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;
        int remaining = left.length + right.length;
        while (remaining > 0) {
            if (leftIndex == left.length) {
                items[targetIndex] = right[rightIndex++];
            } else if (rightIndex == right.length) {
                items[targetIndex] = left[leftIndex++];
            } else if (left[leftIndex] < right[rightIndex]) {
                items[targetIndex] = left[leftIndex++];
            } else {
                items[targetIndex] = right[rightIndex++];
            }

            targetIndex++;
            remaining--;
        }
    }

}
