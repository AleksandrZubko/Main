package week_2.task_3;

/**
 * Created by it170692gda on 22.02.17.
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        for (int i =0; i < length; i++){
            for (int j = length - 1; j > i; j--){
                if (array[j] < array[j - 1]){
                    int y = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = y;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}