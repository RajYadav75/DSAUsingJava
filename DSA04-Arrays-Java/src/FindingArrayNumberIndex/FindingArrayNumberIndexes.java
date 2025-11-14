package FindingArrayNumberIndex;

public class FindingArrayNumberIndexes {

    public static void main(String[] args) {
        int[] arr = {71, 22, 93, 54, 85, 96, 107, 88, 99};
        int findingValue = 107;
        System.out.println(findMaxNumberIndex(arr, findingValue));
    }

    private static int findMaxNumberIndex(int[] arr, int findingValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findingValue) {
                return i;
            }
        }
        return -1;
    }
}
