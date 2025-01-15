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
    @Test
    public void testTopTwoScores(){
        int[] array={84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        Assertions.assertArrayEquals(new int[]{90,87},findTopTwoScores(array));
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
    public static int[] findTopTwoScores(int[] array){
        if(array.length<2) return array;
        int[] topScores=new int[2];
        int index=0;
        while(index<array.length){
            if(array[index]>topScores[0])
            topScores[0]=array[index];
            index++;
        }
        index=0;
        while(index<array.length){
            if(array[index]!=topScores[0]&&array[index]>topScores[1])
                topScores[1]=array[index];
            index++;
        }
        return topScores;
    }
    public static int[] findTopTwoScoresOptimized(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }
}
