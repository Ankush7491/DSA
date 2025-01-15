package dsa.array;

import java.util.Arrays;

public class TwoDimensionalArray {

    int[][] twoArray;

    TwoDimensionalArray(int rows,int columns){
        twoArray=new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoArray[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    public void traverse(){
        System.out.println(Arrays.deepToString(twoArray));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoArray[i][j]+ " ||");
            }
            System.out.println("row "+ i);
        }
    }
}
