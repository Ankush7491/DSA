package datastructures.hashtable;

import java.util.HashMap;

public class HTAPP  {
    public static void main(String[] args) {
        int[] array1=new int[]{1,2,3,4};
        int[] array2=new int[]{};
        System.out.println(itemInCommon(array1,array2));
        HashTable hashTable=new HashTable();
        hashTable.set("Suzuki",1);
        hashTable.set("Hyundai",2);
        hashTable.set("TATA",3);
        hashTable.set("Lexus",89);
        hashTable.set("Merc",90);
        hashTable.printTable();
        System.out.println(hashTable.get("TATA"));
        System.out.println(hashTable.keys());
    }
    public static boolean  itemInCommon(int[] array1,int[] array2){
        HashMap<Integer,Integer>   arrayMap=new HashMap<Integer, Integer>();
        if(array1==null||array2==null||array1.length==0||array2.length==0) return false;
        for(int intValue:array1){
                    arrayMap.put(Integer.valueOf( intValue),Integer.valueOf( intValue));
                }
                for(int secondValue:array2){
                    if(arrayMap.keySet().contains(secondValue))
                        return true;
                }
        return false;
    }
}
