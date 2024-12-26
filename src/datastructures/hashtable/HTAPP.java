package datastructures.hashtable;

import java.util.*;

public class HTAPP  {
    public static void main(String[] args) {

        System.out.println(firstUniqChar("loveleetcode"));
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        printArray(result1);
        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        printArray(result2);

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
       printArray(result3);
        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
      printArray(result4);
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));


        int[] array=new int[]{7,0,5,8,4};
        printArray(twoSum(array,4));
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
    public static int firstUniqChar(String inputString) {
        int minimumUnique=-1;
        Map<Character,Integer> dataMap=new HashMap<>();
        if(inputString==null) return -1;
        char[] chars=inputString.toCharArray();
        for(Character c:chars) {
            Integer occurencies=dataMap.getOrDefault(c,0)+1;
            dataMap.put(c,occurencies);
        }
        System.out.println(dataMap);
        for (int i = 0; i < chars.length; i++) {
            if(dataMap.get(chars[i])==1)return i;
        }
        return minimumUnique;
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
    public static int[] twoSum(int[] nums,int target){
        int[] indexArray = new int[0];
        Map<Integer,Integer> numsMap=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int num= nums[i];
            Integer possibleIndex=numsMap.get(target-num);
            if(possibleIndex==null)
            numsMap.put(num,i);
            else{
                indexArray=new int[2];
                indexArray[1]=i;
                indexArray[0]=possibleIndex.intValue();
                return indexArray;
            }
        }
        return indexArray;
    }
    public static void printArray(int[] array){
        for(int num:array){
            System.out.print(num+ "  ");
        }
        System.out.println(" ");
    }
    public static int[] subarraySum(int[] nums,int target){
        int[] indexes=new int[0];
        Map<Integer,Integer> sumMap=new HashMap<>();
        int sum=0;
        for (int i = 0; i <nums.length; i++) {
           sum=sum+nums[i];
            Integer possibleIndex=null;
           if(sum==target){
               possibleIndex=0;
           }else if(sum>target){
               int sumComplement=sum-target;
               possibleIndex=sumMap.get(sumComplement);
               if(possibleIndex!=null) possibleIndex++;
           }
           if(possibleIndex==null)
               sumMap.put(sum,i);
           else{
               int indexLength=i-possibleIndex;
               indexes=new int[2];
               indexes[0]=possibleIndex;
               indexes[1]=i;
               return indexes;
           }
        }

        return indexes;
    }
}
