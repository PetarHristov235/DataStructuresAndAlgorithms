package sortAlgorithms.sortUsingJdk.selectionSort;

public class SelectionSort {

    public static void main(final String[] args) {
        final int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length-1; 0 < lastUnsortedIndex; lastUnsortedIndex--){
        int largest=0;
            for (int i = 1; i <=lastUnsortedIndex ; i++) {
                if(intArray[i]> intArray[largest]){
                    largest=i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);
}
        for (final int j : intArray) {
            System.out.println(j);
        }
    }
    public static void swap(final int[] arr, final int i, final int j) {
        if (i == j) {
            return;
        }
        final int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }}
