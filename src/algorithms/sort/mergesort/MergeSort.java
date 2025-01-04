package algorithms.sort.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1,int[] array2){
        int[] merged=new int[array1.length+array2.length];
        int index=0;
        int i=0,j=0;
        while(i<array1.length&&j<array2.length){
            if(array1[i]<array2[j]){
                merged[index]=array1[i];
                index++;
                i++;
            }else{
                merged[index]=array2[j];
                index++;
                j++;
            }
        }
        while(i<array1.length){
            merged[index]=array1[i];
            index++;
            i++;
        }
        while(j<array2.length){
            merged[index]=array2[j];
            index++;
            j++;
        }
        return merged;
    }
    public static int[] mergeSort(int[] array){
        if(array.length==1) return array;
        int midIndex=array.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(array,0,midIndex));
        int[] right=mergeSort(Arrays.copyOfRange(array,midIndex,array.length));
        return merge(left,right);
    }

    public static void main(String[] args) {
        int[] array1={1,3,7,8};
        int[] array2={2,4,5,6};
        int[] array={4,3,8,1,9,7,4,2};
        System.out.println(Arrays.toString(merge(array1,array2)));
        System.out.println(Arrays.toString(mergeSort(array)));
    }
}
