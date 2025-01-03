package algorithms.sort.insertion;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] nums){
        for (int i = 1; i <nums.length; i++) {
            int temp=nums[i];
            int j=i-1;
            while(j>-1&&temp<nums[j]){
                nums[j+1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,4,3,5,6};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
