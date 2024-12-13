import classes.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      /* Complexity complexity=new Complexity();
       complexity.printPolynomialComplexity(5,4);
      */
        Car car= new Car("Green");
        System.out.println(car.getColor());
        Car car2 = new Car("Silver");
        System.out.println(car2.getColor());
    }
}