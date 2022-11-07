package searchAlgorithmgs;

public class LinearSearch {

    public static void main(final String[] args) {
        final int [] intArray={20,35,-15,7,55,1,-22};
        System.out.println(linearSearch(intArray,-15));
    }
    public static int linearSearch(final int[] input, final int value){
        for (int i = 0; i <input.length ; i++) {
            if(input[i]== value){
                return i;
            }
        }
    return -1;}
}
