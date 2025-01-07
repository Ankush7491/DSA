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
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int profit1 = maxProfit(prices1);
        System.out.println("Test case 1: Maximum profit: " + profit1); // prints "Maximum profit: 5"

        int[] prices2 = {7, 6, 5, 4, 3, 2, 1};
        int profit2 = maxProfit(prices2);
        System.out.println("Test case 2: Maximum profit: " + profit2); // prints "Maximum profit: 0"

        int[] prices3 = {1, 2, 3, 4, 5, 6, 7};
        int profit3 = maxProfit(prices3);
        System.out.println("Test case 3: Maximum profit: " + profit3); // prints "Maximum profit: 6"

        int[] prices4 = {3, 2, 6, 5, 0, 3};
        int profit4 = maxProfit(prices4);
        System.out.println("Test case 4: Maximum profit: " + profit4); // prints "Maximum profit: 4"

        int[] prices5 = {2, 4, 1};
        int profit5 = maxProfit(prices5);
        System.out.println("Test case 5: Maximum profit: " + profit5); // prints "Maximum profit: 2"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Maximum profit: 5
            Test case 2: Maximum profit: 0
            Test case 3: Maximum profit: 6
            Test case 4: Maximum profit: 4
            Test case 5: Maximum profit: 2
        */

        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("Test case 1: New length: " + newLength1);
        System.out.println("Test case 1: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)));

        int[] nums2 = {1, 1, 2};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("Test case 2: New length: " + newLength2);
        System.out.println("Test case 2: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)));

        int[] nums3 = {-1, 0, 0, 0, 3, 3};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("Test case 3: New length: " + newLength3);
        System.out.println("Test case 3: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)));

        int[] nums4 = {};
        int newLength4 = removeDuplicates(nums4);
        System.out.println("Test case 4: New length: " + newLength4);
        System.out.println("Test case 4: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4)));

        int[] nums5 = {1, 1, 1, 1, 1};
        int newLength5 = removeDuplicates(nums5);
        System.out.println("Test case 5: New length: " + newLength5);
        System.out.println("Test case 5: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)));

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: New length: 5
            Test case 1: Unique values in list: [0, 1, 2, 3, 4]
            Test case 2: New length: 2
            Test case 2: Unique values in list: [1, 2]
            Test case 3: New length: 3
            Test case 3: Unique values in list: [-1, 0, 3]
            Test case 4: New length: 0
            Test case 4: Unique values in list: []
            Test case 5: New length: 1
            Test case 5: Unique values in list: [1]
        */

        String[] stringList1 = {"apple", "banana", "kiwi", "pear"};
        String longest1 = findLongestString(stringList1);
        System.out.println("Test case 1: Longest string: " + longest1);  // prints "banana"

        String[] stringList2 = {"cat", "giraffe", "elephant", "hippopotamus"};
        String longest2 = findLongestString(stringList2);
        System.out.println("Test case 2: Longest string: " + longest2);  // prints "hippopotamus"

        String[] stringList3 = {"sun", "moon", "planet", "universe"};
        String longest3 = findLongestString(stringList3);
        System.out.println("Test case 3: Longest string: " + longest3);  // prints "universe"

        String[] stringList4 = {"java", "python", "javascript", "c"};
        String longest4 = findLongestString(stringList4);
        System.out.println("Test case 4: Longest string: " + longest4);  // prints "javascript"

        String[] stringList5 = {"", "a", "aa", "aaa"};
        String longest5 = findLongestString(stringList5);
        System.out.println("Test case 5: Longest string: " + longest5);  // prints "aaa"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Longest string: banana
            Test case 2: Longest string: hippopotamus
            Test case 3: Longest string: universe
            Test case 4: Longest string: javascript
            Test case 5: Longest string: aaa
        */



        int[] nums={1,2,3,8,1,5,9,6};
        System.out.println(removeElement(nums,1));
        int[] nums0 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val1 = 1;
        System.out.println(Arrays.toString(findMaxMin(nums0)));
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

    public static String findLongestString(String[] stringList) {
        String longestString="";
        for(String current:stringList){
            int charLength=current.length();
            if(charLength>longestString.length()){
                longestString=current;
            }
        }
        return longestString;
    }
    public static int removeDuplicates(int[] nums){
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int top =0;
        nums[top]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]>nums[top])
            {
                top++;
                nums[top]=nums[i];
            }
        }
        return top+1;
    }
    public static int removeDuplicatesUsingPointers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int writePointer = 1;

        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        return writePointer;
    }
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
    static int maxProfit(int price[],
                         int start, int end)
    {
        // If the stocks can't be bought
        if (end <= start)
            return 0;

        // Initialise the profit
        int profit = 0;

        // The day at which the stock
        // must be bought
        for (int i = start; i < end; i++)
        {
            // The day at which the
            // stock must be sold
            for (int j = i + 1; j <= end; j++)
            {
                // If buying the stock at ith day and
                // selling it at jth day is profitable
                if (price[j] > price[i])
                {

                    // Update the current profit
                    int curr_profit = price[j] - price[i] +
                            maxProfit(price,
                                    start, i - 1) +
                            maxProfit(price,
                                    j + 1, end);

                    // Update the maximum profit so far
                    profit = Math.max(profit,
                            curr_profit);
                }
            }
        }
        return profit;
    }
}
