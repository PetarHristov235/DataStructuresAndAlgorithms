package searchAlgorithmgs;

public class BinarySearch {

    public static void main(final String[] args) {
        final int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, 1));

    }

    //using loops
    public static int iterativeBinarySearch(final int[] input, final int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            final int midpoint = (start + end) / 2;
            System.out.println("midpoint=" + midpoint);
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }

    //using recursion
    public static int recursiveBinarySearch(final int[] intput, final int value) {
        return recursiveBinarySearch(intput, 0, intput.length, value);
    }

    private static int recursiveBinarySearch(final int[] intput, final int start, final int end, final int value) {
        if (start >= end) {
            return -1;
        }
        final int midpoint = (start + end) / 2;
        System.out.println("midpoint =" + midpoint);

        if (intput[midpoint] == value) {
            return midpoint;
        } else if (intput[midpoint] < value) {
            return recursiveBinarySearch(intput, midpoint + 1, end, value);
        } else {
           return recursiveBinarySearch(intput, start, midpoint, value);
        }
    }
}
