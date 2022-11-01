package mergeSort;

public class MergeSort {

    public static void main(final String[] args) {
        final int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray,0, intArray.length);


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(final int[] input, final int start, final int end) {
        if (2 > end - start) {
            return;
        }

        final int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, final int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input,i,input,start+tempIndex, mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);
    }
}