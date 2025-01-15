package dsa.array;

import java.util.Arrays;

public class ArrayProblemsApp {
    public static void main(String[] args) {
        int[] array={1,2,5,8,9};
        int[] array2={1};
        System.out.println(Arrays.toString(middle(array)));
    }
    public static int[] middle(int[] array) {
        if(array.length<=2) return new int[0];
        int[] newArray=new int[array.length-2];
        for (int i = 1; i < array.length-1; i++) {
            newArray[i-1]=array[i];
        }
        return newArray;
    }
}
