package Lessons.Lesson_1;
import java.util.*;
public class TestArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copied = new int[10];
        System.arraycopy(arr, 0, copied, 1, 4);//5 is the length to copy
        System.out.println(Arrays.toString(copied));

        int[] copied1 = Arrays.copyOf(arr, 10); //10 the the length of the new array
        System.out.println(Arrays.toString(copied1));

        copied1 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(copied1));
    }
}
