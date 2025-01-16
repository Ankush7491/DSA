package dsa.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayProblemsApp {
    public static void main(String[] args) {

    }

    @Test
    public  void testSumDiagonalElements() {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        Assertions.assertEquals(15,sumDiagonalElements(array));
    }
    @Test
    public void testTopTwoScores(){
        int[] array={84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        Assertions.assertArrayEquals(new int[]{90,87},findTopTwoScores(array));
    }
    public static void testMiddle(){
        int[] array={1,2,5,8,9};
        int[] array2={1};
        System.out.println(Arrays.toString(middle(array)));
    }
    public static int[] middle(int[] array) {
        if(array.length<=2) return new int[0];
        int[] newArray=new int[array.length-2];
        for (int i = 1; i < array.length-1; i++) {
            newArray[i-1]=array[i];
        }
        return newArray;
    }
    public static int sumDiagonalElements(int[][] array) {
        if(array.length==0) return 0;
        if(array[0].length==0) return 0;
        int sum=0;
        for (int i = 0; i < array.length; i++) {
                        sum+=array[i][i];
        }
        return sum;
    }
    public static int[] findTopTwoScores(int[] array){
        if(array.length<2) return array;
        int[] topScores=new int[2];
        int index=0;
        while(index<array.length){
            if(array[index]>topScores[0])
            topScores[0]=array[index];
            index++;
        }
        index=0;
        while(index<array.length){
            if(array[index]!=topScores[0]&&array[index]>topScores[1])
                topScores[1]=array[index];
            index++;
        }
        return topScores;
    }
    public static int[] findTopTwoScoresOptimized(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }
    public static int findMissingNumberInArray(int[] arr) {
        int n=arr.length+1;
        int sum=(n * (n + 1)) / 2;
        for(int element:arr){
            sum-=element;
        }
        return sum;
    }
    @Test
    public void testMissingNumberInArray(){
        int[] myArray = {1,2,3,4,6,5,8};
        Assertions.assertEquals(7,findMissingNumberInArray(myArray));
    }
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int uniques=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[uniques]!=arr[i])
            {
             uniques++;
             arr[uniques]=arr[i];
            }
        }
        int[] uniqueArray=Arrays.copyOfRange(arr,0,uniques+1);
        return uniqueArray;
    }
    @Test
    public void testRemoveDuplicates(){
        int[] inputArray={1,1,2,2,3,4,5,6,8,8,9};
        int[] expectedOutput={1,2,3,4,5,6,8,9};
        Assertions.assertArrayEquals(expectedOutput,removeDuplicates(inputArray));
    }
    public int removeDuplicatesLength(int[] nums) {
        int uniques=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[uniques]!=nums[i])
            {
                uniques++;
                nums[uniques]=nums[i];
            }
        }
        return uniques+1;
    }
    @Test
    public void testRemoveDuplicatesLength(){
        int[] inputArray={1,2,2,3,5,6,8,8,9};
        int expectedOutput=7;
        Assertions.assertEquals(expectedOutput,removeDuplicatesLength(inputArray));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] output=new int[2];
        int element,complement;
        for (int i = 0; i < nums.length ; i++) {
            element=nums[i];
            complement=target-element;
            for (int j = 0 ; j <nums.length ; j++) {
                if(i!=j&&nums[j]==complement)
                {
                    output[0]=i;
                    output[1]=j;
                    return output;
                }
            }
        }

        return output;
    }
    @Test
    public void testTwoSum(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] outputArray={0,1};
        Assertions.assertArrayEquals(outputArray,twoSum(nums,target));
        int[] nums1 = {3,2,4};
        int target1=6;
        int[] outputArray1={1,2};
        Assertions.assertArrayEquals(outputArray1,twoSum(nums1,target1));
    }
    public int searchInArray(int[] intArray, int valueToSearch) {
        int index=-1;
        if(intArray.length==0) return index;
        for (int i = 0; i <intArray.length ; i++) {
            if(valueToSearch==intArray[i])
                return i;
        }
        return index;
    }
    @Test
    public void testSearchInArray(){
        int[] intArray = {1,2,3,4,5,6};
        Assertions.assertEquals(5,searchInArray(intArray,6));
    }
    public String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i]*intArray[j]>maxProduct) {
                    maxProduct = intArray[i]*intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
    @Test
    public void testMaxProduct(){
        int[] intArray = {10,20,30,40,50};
        Assertions.assertEquals("40,50",maxProduct(intArray));
    }

    public static boolean isUnique(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            int current=intArray[i];
            for (int j = 0; j < intArray.length; j++) {
                if(i!=j&&intArray[j]==current)
                    return false;
            }
        }

        return true;
    }
    @Test
    public void testIsUnique(){
        int[] intArray = {1,2,3,4,5,6};
        Assertions.assertEquals(true,isUnique(intArray));
    }
    public boolean permutation(int[] array1, int[] array2){
        if(array1.length!=array2.length) return false;
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]!=array2[i])
                return false;
        }

        return true;
    }
    @Test
    public void testPermutation(){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        Assertions.assertEquals(true,permutation(array1, array2));
    }
}
