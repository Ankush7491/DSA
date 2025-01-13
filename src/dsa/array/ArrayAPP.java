package dsa.array;

public class ArrayAPP {
    public static void main(String[] args) {
        SingleDimensionalArray singleDimensionalArray=new SingleDimensionalArray(9);
        singleDimensionalArray.insert(7,90);
        singleDimensionalArray.traverse();
        int i=90;
        System.out.println("Location of the value"+i+" is "+singleDimensionalArray.findIndex(i));

    }
}
