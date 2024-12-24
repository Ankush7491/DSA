package datastructures.set;

import java.util.*;

public class SETAPP {

    public static void main(String[] args) {
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
}
