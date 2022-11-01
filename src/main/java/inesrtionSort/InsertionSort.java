package inesrtionSort;

public class InsertionSort {

    public static void main(final String[] args) {
        final int[] intArray={20,35,-15,7,55,1,-22,};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex <intArray.length ; firstUnsortedIndex++) {
            final int newElement=intArray[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; 0 < i && intArray[i-1]>newElement ; i--) {
                   intArray[i]= intArray[i-1];
            }

            intArray[i]=newElement;
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
