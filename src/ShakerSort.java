public class ShakerSort {
    public static void shakerSort(int[] array) {
        int leftSide = 0;
        int rightSide = array.length - 1;
        int temp;

        do {
            for (int i = leftSide; i < rightSide; i++) { // Сортир. влево ищем МАКС. знач.
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--; // Уменьшаем количество проходов
            for (int i = rightSide; i > leftSide; i--) { // Теперь идём в обратную сторону ищем МИН.
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++; // Уменьшаем количество проходов
        } while (leftSide < rightSide);

    }
}