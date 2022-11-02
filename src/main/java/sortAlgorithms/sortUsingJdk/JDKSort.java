package sortAlgorithms.sortUsingJdk;

import java.util.Arrays;
import java.util.Scanner;

public class JDKSort {
/**Sort and parallel sort implemented
 *In order to see the results of both algorithms after running the main method, pleaase be advised that
 * 1: is the command for sorting by Arrays.sort (dualPivotQuickSort)
 * 2: is the command for sorting by Arrays.parallelSort
 * */


    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            final int sortType = Integer.parseInt(command);

            switch (sortType) {
                case 1 -> {
                    System.out.println("parralel sort");
                    Arrays.sort(intArray);
                    printArray(intArray);
                }
                case 2 -> {
                    System.out.println("parralel sort");
                    Arrays.parallelSort(intArray);
                    printArray(intArray);
                }
                default -> System.out.println("Unknown command! The Array will not be sorted.");
            }
            command = scanner.nextLine();
        }
    }

    private static void printArray(final int[] intArray) {
        for (final int j : intArray) {
            System.out.println(j);
        }
    }
}



