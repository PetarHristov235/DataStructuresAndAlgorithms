package sortAlgorithms.sortUsingJdk.bubbleSort;

public class BubbleSort {

    public static void main(final String[] args) {
        final int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; 0 < lastUnsortedIndex; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] < intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (final int i : intArray) {
            System.out.println(i);
        }
    }

    public static void swap(final int[] arr, final int i, final int j) {
        if (i == j) {
            return;
        }
        final int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
