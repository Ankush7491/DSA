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

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j]+ " ||");
            }
            System.out.println("row "+ i);
        }
    }
    public void insert(int row,int column,int value) {
        try {
            if (twoArray[row][column] == Integer.MIN_VALUE)
                twoArray[row][column] = value;
            else System.out.println("Already Occupied,cannot insert");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid Index for insertion");
        }
    }
    public void accessCell(int row,int column){
        try{
            System.out.println("Cell Accessed "+row+" | "+column+" = "+twoArray[row][column]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot access cell");
        }
    }
}
