package sortAlgorithms.sortUsingJdk.shellSort;

public class ShellSort {

    public static void main(final String[] args) {
        final int[] intArray={20,35,-15,7,55,1,-22};
        for (int gap = intArray.length/2; 0 < gap; gap/=2) {


            for (int i = 0; i < intArray.length ; i++) {
                final int newElement=intArray[i];

                int j=i;

                while(j>=gap && intArray[j-gap]>newElement){
                    intArray[j]=intArray[j-gap];
                    j-=gap;
                }

                intArray[j]=newElement;
            }
        }

        for (int i = 0; i <intArray.length ; i++) {
            System.out.println(intArray[i]);
        }
    }
}
