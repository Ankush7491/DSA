package datastructures.set;

import java.util.*;

public class SETAPP {

    public static void main(String[] args) {
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
}
