package datastructures.set;

import java.util.*;

public class SETAPP {

    public static void main(String[] args) {

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
            System.out.println(element.toString()+" ");
        }
    }
}
