package classes;

import lombok.Getter;
import lombok.Setter;

public class Car {

    @Getter
    @Setter
    private String color;


    public Car(String color) {
        this.color = color;
    }
}
