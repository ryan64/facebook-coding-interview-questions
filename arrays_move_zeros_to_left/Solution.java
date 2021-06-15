package arrays_move_zeros_to_left;

public class Solution {
    static void moveZerosToLeft(int[] ARRAY){
        int readIndex = ARRAY.length - 1;
        int writeIndex = ARRAY.length - 1;

        while (readIndex >= 0){
            if (ARRAY[readIndex] != 0){
                ARRAY[writeIndex] = ARRAY[readIndex];
                writeIndex = writeIndex - 1;
            }
            readIndex = readIndex - 1;
        }

        while (writeIndex >= 0) {
            ARRAY[writeIndex] = 0;
            writeIndex = writeIndex - 1;
        }
    }
}
