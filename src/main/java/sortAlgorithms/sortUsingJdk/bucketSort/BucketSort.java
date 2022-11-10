package sortAlgorithms.sortUsingJdk.bucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    public static void main(final String[] args) {
        final int[] intArray={54,46,83,66,95,92,43};
        bucketSort(intArray);

        for (final int i : intArray) {
            System.out.println(i);
        }
    }

    private static void bucketSort(final int[] input) {
    final List<Integer>[] buckets=new List[10];

        for (int i = 0; i <buckets.length ; i++) {
            buckets[i]=new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length ; i++) {
        buckets[hash(input[i])].add(input[i]);
        }
        for (final List bucket:buckets){
            Collections.sort(bucket);
        }
        
        int j=0;
        for (int i = 0; i <buckets.length ; i++) {
            for (final int value :buckets[i]) {
                input[j++]=value;
            }
        }
    }

     private static int hash(final int value){
        return value/ 10;
     }
}
