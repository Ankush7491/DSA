package algorithms.fibonacci;

public class Fib_Bottom_Up {
    static int counter=0;

    public static int fib(int n){
        int[] fibList=new int[n+1];
        fibList[0]=0;
        fibList[1]=1;
        for (int i = 2; i <= n; i++) {
            counter++;
            fibList[i]=fibList[i-1]+fibList[i-2];
        }
        return fibList[n];
    }

    public static void main(String[] args) {
        int n=9;
        System.out.println("fib of "+n+" is "+fib(n));
        System.out.println(counter+" iterations ");
    }
}
