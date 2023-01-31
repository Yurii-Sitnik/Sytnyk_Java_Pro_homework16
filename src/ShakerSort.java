public class ShakerSort {
    public static void shakerSort(int[] array) {
        int leftSide = 0;
        int rightSide = array.length - 1;
        int temp;

        do {
            for (int i = leftSide; i < rightSide; i++) { // Sort to the left looking for the maximum value
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--; // We reduce the number passages
            for (int i = rightSide; i > leftSide; i--) { // Now we go in the opposite direction and look for the minimum value
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++; // We reduce the number passages
        } while (leftSide < rightSide);

    }
}