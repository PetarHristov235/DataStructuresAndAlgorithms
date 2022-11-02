package sortAlgorithms.sortUsingJdk.inesrtionSort;

public class InsertionSort {

    public static void main(final String[] args) {
        final int[] intArray={20,35,-15,7,55,1,-22};
//        insertionSort(intArray, intArray.length);
        System.out.println(intArray);
        for (int firstUnsortedIndex = 1; firstUnsortedIndex <intArray.length ; firstUnsortedIndex++) {
            final int newElement=intArray[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; 0 < i && intArray[i-1]>newElement ; i--) {
                   intArray[i]= intArray[i-1];
            }

            intArray[i]=newElement;
        }

        for (final int i : intArray) {
            System.out.println(i);
        }
    }

//    public static void insertionSort(final int[] input, final int numItems){
//        if (numItems<2){
//            return;
//        }
//        insertionSort(input,numItems-1);
//
//        int newElement=input[numItems-1];
//
//        int i;
//
//        for (i = numItems-1; i >0 && input[i-1]>newElement  ; i--) {
//            input[i]= input[i-1];
//        }
//        input[i]=newElement;
//    }

}
