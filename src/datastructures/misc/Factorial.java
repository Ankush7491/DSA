package datastructures.misc;

public class Factorial {

    public static void main(String[] args) {
        System.out.println( factorial(4));

    }

    private static int factorial(int i) {
        if(i==1) return 1;
        return i*factorial(i-1);
    }
}
