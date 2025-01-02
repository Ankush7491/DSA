package algorithms.sort.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] nums){
        for (int i = nums.length-1; i >0 ; i--) {
            for (int j = 0; j <i; j++) {
                if(nums[j]>nums[j+1]){
                    int current=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=current;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,7,9,3,2,5,4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
