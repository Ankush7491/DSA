public class Complexity {

    public void printLinearComplexity(int size){
        for(int i=0;i<size;i++){
            System.out.println(i);
        }
    }

    public void printPolynomialComplexity(int x,int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println(i+"  "+j);
            }
        }
    }
}
