package resources;

import java.util.List;

public class Operations {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static Integer[][] convertToNestedArray(List<List<Integer>> list) {
        Integer[][] array = new Integer[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            List<Integer> sublist = list.get(i);
            array[i] = sublist.toArray(new Integer[0]);
        }
        return array;
    }
}
