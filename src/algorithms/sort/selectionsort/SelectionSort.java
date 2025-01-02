package algorithms.sort.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] nums){

        for (int i= 0; i <nums.length; i++) {
            int min=i;
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            if(i!=min){
                int current=nums[i];
                nums[i]=nums[min];
                nums[min]=current;
            }

        }
    }

    public static void main(String[] args) {
        int nums[] = new int[]{9,5,6,3,2,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
