package swaping_arrayvalue;

public class CallByValueNotReference {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13, 14, 15};
        int[] array2 = {20, 21, 22, 23, 24, 25};
        System.out.println("Address of Array " + array + "\n " + array2);
        swapTwoArray(array, array2);
    }

    public static void swapTwoArray(int[] array1, int[] array2) {
        int[] temp = array1;
        array1 = array2;
        array2 = temp;
    }
}
