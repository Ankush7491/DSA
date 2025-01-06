package algorithms.fibonacci;

public class Fib_Na_Memo {

    static int counter=0;

    public static int fib(int n){
        counter++;
        if(n==0||n==1) return n;
        return fib(n-1)+fib(n-2);
    }


    public static void main(String[] args) {
        System.out.println(fib(9));
        System.out.println(counter+" method calls");
    }
}
