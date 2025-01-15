package dsa.array;

import java.util.Scanner;

public class Temperature {

    int[] temperatures;
    Temperature(int days){
        temperatures=new int[days];
    }

    public void captureTemperatures(Scanner scanner){
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Please enter the temperature for the day "+(i+1));
            temperatures[i]=scanner.nextInt();
        }
    }
    public int calculateAverage(){
        int sumTemp=0;
        for(int dayTemp:temperatures){
            sumTemp+=dayTemp;
        }
        return sumTemp/temperatures.length;
    }
    public int daysAboveAverageTemperature(int average){
        int days=0;
        for(int dayTemp:temperatures){
            if(dayTemp>average)
                days++;
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner tempScanner=new Scanner(System.in);
        System.out.println("How many days to record temperature??");
        int days= tempScanner.nextInt();
        Temperature temperature=new Temperature(days);
        temperature.captureTemperatures(tempScanner);
        int average=temperature.calculateAverage();
        System.out.println("The average Temperature is "+average);
        System.out.println("No of days above average Temperature is "+temperature.daysAboveAverageTemperature(average));
    }
}
