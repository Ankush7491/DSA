package datastructures.set;

import java.util.*;

public class SETAPP {

    public static void main(String[] args) {
        int[] nums1=new int[] {1, 2, 3, 4, 5};
        int[] nums2= new int[]{5,7,1,9,3};
        int[] nums3=new int[] {1, 2, 2,3, 4, 5};
        System.out.println(Arrays.toString(intersection(nums2,nums1)));
        System.out.println(longestConsecutiveSequence(nums1));
        System.out.println(longestConsecutiveSequence(nums2));
        System.out.println(longestConsecutiveSequence(nums3));
        int[] arr1 = {1, 2, 3, 4, 3};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;
        List<int[]> pairs=findPairs(arr1,arr2,target);
        for(int[] pair:pairs) System.out.println(Arrays.toString(pair));
        System.out.println(hasUniqueChars("this"));
        Integer[] array=new Integer[]{1,2,3,4,5};
        List<Integer> inputList=new ArrayList<>(Arrays.asList(array));
        System.out.println(inputList);
        System.out.println(removeDuplicates(inputList));
    }

    public static List<Integer> removeDuplicates(List<Integer> myList){
        List<Integer> uniqueList=null;
        if(myList==null) return uniqueList;
        if(myList.size()==0) return new ArrayList<>();
        Set<Integer> uniqueElementSet=new HashSet<>();
        for (int i = 0; i <myList.size() ; i++) {
            Integer element=myList.get(i);
            if(!uniqueElementSet.contains(element))
                uniqueElementSet.add(element);
        }
        uniqueList=new ArrayList<>(uniqueElementSet);
        return  uniqueList;
    }
    public static List<Integer> removeDuplicatesOptimized(List<Integer> myList) {
        Set<Integer> uniqueSet = new HashSet<>(myList);
        return new ArrayList<>(uniqueSet);
    }
    public static boolean hasUniqueChars(String string){
        if(string!=null){
            char[] chars= string.toCharArray();
            if(chars.length<=1) return true;
            Set<Character> uniqueSet=new HashSet();
            for(char character:chars){
                uniqueSet.add(character);
            }
            if(uniqueSet.size()==chars.length) return true;
        }
        return false;
    }
    public static void printSet(Set<Character> elementSet){
        for(Character element:elementSet){
            System.out.print(element.toString()+" ");
        }
    }
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){
        List<int[]> pairs=new ArrayList<>();
        if(arr1.length==0||arr2.length==0) return pairs;
        Set<Integer> arr1Set=new HashSet<>();
        for(int a2:arr1)arr1Set.add(a2);
        for(int a2:arr2){
            int complement=target-a2;
            if(arr1Set.contains(complement))
            {
                int[] temp=new int[]{a2,complement};
                pairs.add(temp);
            }
        }
        return pairs;
    }
    public static int longestConsecutiveSequence(int[] nums){
        int length=1;
        if(nums==null) return 0;
        if(nums.length==0) return 0;
        if(nums.length==1) return length;
        Set<Integer> numsSet=new HashSet<>();
        for(int num:nums) numsSet.add(num);
        for(int num:nums){
            while(numsSet.contains(num+length))
            {
                length++;
            }
        }

        return length;
    }
    public static int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> intersectionSet;
        Set<Integer> nums1Set=new HashSet<>();
        for(Integer num1:nums1){
            nums1Set.add(num1);
        }
        Set<Integer> nums2Set=new HashSet<>();
        for(Integer num2:nums2){
            nums2Set.add(num2);
        }
        intersectionSet=new HashSet<>(nums1Set);
        intersectionSet.retainAll(nums2Set);
        int[] common=new int[intersectionSet.size()];
        if(common.length==0) return common;
        int index=0;
        for(Integer integer:intersectionSet){
            common[index]=integer.intValue();
            index++;
        }
        return common;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersectionSet=new HashSet<>();
        Set<Integer> nums1Set=new HashSet<>();
        for(Integer num1:nums1){
            nums1Set.add(num1);
        }
        for(Integer num2:nums2){
            if(nums1Set.contains(num2))
            intersectionSet.add(num2);
        }
        int[] common=new int[intersectionSet.size()];
        if(common.length==0) return common;
        int index=0;
        for(Integer integer:intersectionSet){
            common[index]=integer.intValue();
            index++;
        }
        return common;
    }
}
