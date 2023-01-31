import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31) - 15);
        }
        System.out.println("Было до сортировки");
        System.out.println(Arrays.toString(array));

        QuickSort.quickSort(array,0,array.length-1);
        System.out.println("Стало после быстрой сортировки");
        System.out.println(Arrays.toString(array));

        ShakerSort.shakerSort(array);
        System.out.println("Стало после шейкерной сортировки");
        System.out.println(Arrays.toString(array));
    }
}
