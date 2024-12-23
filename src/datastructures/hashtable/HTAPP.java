package datastructures.hashtable;

import java.util.*;

public class HTAPP  {
    public static void main(String[] args) {
        String[] inputArray=new String[]{"eat","ate","mate","tame","bat","pot","top","tea","post","stop","pots"};
        System.out.println(groupAnagrams(inputArray));

        System.out.println(firstNonRepeatingChar("CeettCode"));
        int[] array1=new int[]{1,3,1,3,1};
        int[] array2=new int[]{};
        System.out.println(findDuplicates(array1));
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
    public static List<Integer>  findDuplicates(int[] array1){
        List<Integer> duplicatesList=new ArrayList<>();
        if(array1==null||array1.length==0) return duplicatesList;
        Map<Integer,Boolean> arrayMap=new HashMap<>();
        for(int intValue:array1){
            if(arrayMap.get(intValue)==null)
            arrayMap.put(intValue,false);
            else {
                if (arrayMap.get(intValue)==false)
                duplicatesList.add(intValue);
                arrayMap.put(intValue,true);
            }
        }

        return duplicatesList;
    }
    public static Character firstNonRepeatingChar(String inputString){
        Character character=null;
        Map<Character,Boolean> dataMap=new HashMap<>();
        if(inputString==null) return character;
       // int indexCharacter;
        char[] chars=inputString.toCharArray();
        for(char c:chars){
            if(dataMap.get(c)==null)
            {
                dataMap.put(c,false);
               if(character==null)
                character=c;
            }
            else{
               dataMap.remove(c);
               if(character!=null&&c==character)
               character=null;
            }
        }

        return character;
    }
    public static List<List<String>> groupAnagrams(String[] strings){
        List<List<String>> anagramList=new ArrayList<>();
        Map<Set<Character>,List<String>> mapSet =new HashMap<>();
        for(String string:strings){
            char[] chars=string.toCharArray();
            Map<Character,Boolean> stringMap=new HashMap<>();
            for(char c:chars){
                stringMap.put(c,true);
            }
            List<String> list=mapSet.get(stringMap.keySet());
            if(list==null)
            {
                List<String> newList=new ArrayList<>();
                newList.add(string);
                mapSet.put(stringMap.keySet(),newList);
            }else{
                    list.add(string);
                    mapSet.put(stringMap.keySet(),list);
            }
        }
       for(List<String> list: mapSet.values()){
           anagramList.add(list);
       }
        return anagramList;
    }
}
