package dsa.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListProbAPP {

    @Test
    public void testIteratorArraylist(){
        List<Integer> integerList=new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterator iterator=integerList.iterator();
        Integer sum=0;
        while(iterator.hasNext()){
            sum+=(Integer) iterator.next();
        }
        Assertions.assertEquals(10,sum);
    }
    public boolean isElementPresent(List list,Object element){
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            if(element==iterator.next())
                return true;
        }
        return false;
    }
    @Test
    public void testElementPresent(){
        List<Integer> integerList=new ArrayList<>(Arrays.asList(1,2,3,4));
        Assertions.assertEquals(true,isElementPresent(integerList,3));
    }
    @Test
    public void testElementPresentIfNotInList(){
        List<Integer> integerList=new ArrayList<>(Arrays.asList(1,2,3,4));
        Assertions.assertEquals(false,isElementPresent(integerList,90));
    }
    public Object[] getPairs(int[] input){
        List<Integer> list=new ArrayList<>(input.length*input.length);
        for(Integer integer:input){
            for(Integer inner:input){
                String pair=String.valueOf(integer).concat(String.valueOf(inner));
                list.add(Integer.valueOf(pair));
            }
        }
        return list.toArray();
    }
    @Test
    public void testPairs(){
        int[] array={1,2,3};
        Integer[] expected={11,12,13,21,22,23,31,32,33};
        Assertions.assertArrayEquals(expected,getPairs(array));
    }
    public Object[] getForwardPairs(int[] inputArray){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j <inputArray.length ; j++) {
                String pair=String.valueOf(inputArray[i]).concat(String.valueOf(inputArray[j]));
                list.add(Integer.valueOf(pair));
            }
        }
        return list.toArray();
    }
    @Test
    public void testForwardPairs(){
        int[] array={1,2,3,4};
        Integer[] expected={12,13,14,23,24,34};
        Assertions.assertArrayEquals(expected,getForwardPairs(array));

    }
    public Object[] getConditionalPairs(int[] array1,int[] array2){
        List<Integer> list=new ArrayList<>();
        for(Integer integer1:array1){
            for(Integer integer2:array2){
                if(integer1<integer2)
                {
                    String pair=String.valueOf(integer1).concat(String.valueOf(integer2));
                    list.add(Integer.valueOf(pair));
                }
            }
        }
        return list.toArray();
    }

    @Test
    public void testConditionalPairs(){
        int[] array={1,2,3};
        int[] array2={2,3,1};
        Integer[] expected={12,13,23};
        Assertions.assertArrayEquals(expected,getConditionalPairs(array,array2));
    }
}

