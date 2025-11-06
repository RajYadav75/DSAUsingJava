package swaping_arrayvalue;

import java.util.Arrays;

public class TwoValueSwap {
    public static void main(String[] args) {
        int[] array = {10,11,12,13,14,15};
        swapArray(array,2,4);
        System.out.println(Arrays.toString(array));
    }

    public static void swapArray(int[] array,int firstValue,int secondValue){
        int temp = array[firstValue];
        array[firstValue] = array[secondValue];
        array[secondValue] = temp;
    }
}
