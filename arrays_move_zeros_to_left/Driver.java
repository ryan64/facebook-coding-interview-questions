package arrays_move_zeros_to_left;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args){
        int [] ARRAY = new int[]{1,10,20,0,59,63,0,88,0};
        System.out.println("Array before shift: " + Arrays.toString(ARRAY));
        Solution.moveZerosToLeft(ARRAY);
        System.out.println("Array after shift: " + Arrays.toString(ARRAY));
    }
}
