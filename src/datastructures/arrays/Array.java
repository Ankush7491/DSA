package datastructures.arrays;

import java.util.Arrays;

public class Array {
    public static int removeElement(int[] nums, int val){
        int valids=0;
        if(nums.length==0) return valids;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=val){
                nums[valids]=i;
                valids++;
            }
        }
        return valids;
    }
    public static int[] swapIndexes(int[] nums, int first,int last){
        int temp=nums[last];
        nums[last]=nums[first];
        nums[first]=temp;
        return nums;
    }
    public static int[] findMaxMin(int[] myList){
        if(myList.length==0) return new int[0];
        int currentMin=myList[0];
        int currentMax=myList[0];
        for(int currentVal:myList){
            if(currentVal<currentMin)
                currentMin=currentVal;
            if(currentVal>currentMax)
                currentMax=currentVal;
        }
        return new int[]{currentMax,currentMin};
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,8,1,5,9,6};
        System.out.println(removeElement(nums,1));
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val1 = 1;
        System.out.println(Arrays.toString(findMaxMin(nums1)));
        System.out.println(removeElement(nums1,val1));
        int[] myList2 = {-5, -3, -8, -1, -6, -9};
        int[] result2 = findMaxMin(myList2);
        System.out.println("Test case 2: MaxMin: " + Arrays.toString(result2)); // prints "[-1, -9]"

        int[] myList3 = {0, 0, 0, 0, 0};
        int[] result3 = findMaxMin(myList3);
        System.out.println("Test case 3: MaxMin: " + Arrays.toString(result3)); // prints "[0, 0]"

        int[] myList4 = {100, 200, 300, 400, 500};
        int[] result4 = findMaxMin(myList4);
        System.out.println("Test case 4: MaxMin: " + Arrays.toString(result4)); // prints "[500, 100]"

    }
}
