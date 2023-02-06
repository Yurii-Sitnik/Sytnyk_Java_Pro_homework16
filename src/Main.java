import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        long getTimeStart = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31) - 15);
        }
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(array));

        QuickSort.quickSort(array,0,array.length-1);
        long getTimeFinish1 = System.currentTimeMillis();
        System.out.println("Time quickSort " + (getTimeFinish1-getTimeStart+ " ms"));
        System.out.println("Became after quickSort");
        System.out.println(Arrays.toString(array));

        ShakerSort.shakerSort(array);
        long getTimeFinish2 = System.currentTimeMillis();
        System.out.println("Time shakerSort " + (getTimeFinish2-getTimeStart+ " ms"));
        System.out.println("Became after shakerSort");
        System.out.println(Arrays.toString(array));
    }
}
