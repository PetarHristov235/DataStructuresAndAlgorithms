package radixSort;

public class RadixSort {

    public static void main(final String[] args) {
        final int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);
        for (final int j : radixArray) {
            System.out.println(j);
        }
    }

    public static void radixSort(final int[] input, final int radix, final int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(final int[] input, final int position, final int radix) {
        final int numItems = input.length;

        final int[] countArray = new int[radix];

        for (final int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        //adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        final int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; 0 <= tempIndex; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }
        System.arraycopy(temp, 0, input, 0, numItems);
    }

    private static int getDigit(final int position, final int value, final int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}