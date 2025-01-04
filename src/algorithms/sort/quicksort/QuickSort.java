package algorithms.sort.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static int pivot(int[] array,int pivotIndex,int endIndex){
        int swapIndex=pivotIndex;
        for (int i = pivotIndex+1; i <= endIndex; i++) {
            if(array[i]<array[pivotIndex])
            {
                swapIndex++;
                int temp=array[swapIndex];
                array[swapIndex]=array[i];
                array[i]=temp;
            }
        }
        int temp=array[swapIndex];
        array[swapIndex]=array[pivotIndex];
        array[pivotIndex]=temp;
        return swapIndex;
    }
    public static void quickSort(int[] array,int left,int right){
        if(left<right){
            int pivot=pivot(array,left,right);
            quickSort(array,left,pivot-1);
            quickSort(array,pivot+1,right);
        }
    }
    public static void main(String[] args) {

        int[] myArray = {4, 6, 1, 7, 3, 2, 5};

        System.out.println(pivot(myArray,0,myArray.length-1));
        System.out.println(Arrays.toString(myArray));
        quickSort(myArray,0,myArray.length-1);
        System.out.println(Arrays.toString(myArray));


    }
}
