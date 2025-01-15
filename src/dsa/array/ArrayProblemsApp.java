package dsa.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayProblemsApp {
    public static void main(String[] args) {

    }

    @Test
    public  void testSumDiagonalElements() {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        Assertions.assertEquals(15,sumDiagonalElements(array));
    }

    public static void testMiddle(){
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
    public static int sumDiagonalElements(int[][] array) {
        if(array.length==0) return 0;
        if(array[0].length==0) return 0;
        int sum=0;
        for (int i = 0; i < array.length; i++) {
                        sum+=array[i][i];
        }
        return sum;
    }
}
