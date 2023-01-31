public class ShakerSort {
    public static void shakerSort(int[] array) {
        int leftSide = 0;
        int rightSide = array.length - 1;
        int temp;

        do {
            for (int i = leftSide; i < rightSide; i++) { // ������. ����� ���� ����. ����.
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--; // ��������� ���������� ��������
            for (int i = rightSide; i > leftSide; i--) { // ������ ��� � �������� ������� ���� ���.
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++; // ��������� ���������� ��������
        } while (leftSide < rightSide);

    }
}