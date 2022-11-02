
package sortAlgorithms.sortUsingJdk.quickSort;

public class QuickSort {

    public static void main(final String[] args) {
        final int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray,0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(final int[] input, final int start, final int end) {
        if (2 > end - start) {
            return;
        }
        final int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(final int[] input, final int start, final int end) {
        final int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            //NOTE: empty loop body
            while (i < j && input[--j] >= pivot) {
                ;
            }
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) {
                ;
            }
            if (i < j) {
                input[j] = input[i];
            }


        }
        input[j] = pivot;

        return j;
    }

}
