package dsa.array;

public class ArrayAPP {
    public static void main(String[] args) {
       TwoDimensionalArray twoDimensionalArray=new TwoDimensionalArray(3,3);
        twoDimensionalArray.insert(0,1,78);
        twoDimensionalArray.insert(0,0,70);
        twoDimensionalArray.insert(0,1,78);
        twoDimensionalArray.insert(2,1,90);
        twoDimensionalArray.insert(2,2,96);
        twoDimensionalArray.traverse();
        SingleDimensionalArray singleDimensionalArray=new SingleDimensionalArray(9);
        singleDimensionalArray.insert(7,90);
        singleDimensionalArray.traverse();
        int i=90;
        System.out.println("Location of the value"+i+" is "+singleDimensionalArray.findIndex(i));

    }
}
