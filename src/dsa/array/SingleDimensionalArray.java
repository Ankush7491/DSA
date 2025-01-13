package dsa.array;

import java.util.Arrays;

public class SingleDimensionalArray {
    
    private int[] oneArray;
    
    SingleDimensionalArray(int size){
        oneArray=new int[size];
        for (int i = 0; i < size; i++) {
            oneArray[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index,int value){
        oneArray[index]=value;
    }

    public void traverse() {
        System.out.println(Arrays.toString(oneArray));
    }

    public int findIndex(int i) {
        for (int j = 0; j <oneArray.length; j++) {
            if(oneArray[j]==i)
                return j;
        }
        return -1;
    }
}
