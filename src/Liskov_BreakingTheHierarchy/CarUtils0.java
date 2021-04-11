package Liskov_BreakingTheHierarchy;

import java.util.ArrayList;
import java.util.List;

public class CarUtils0 {
    public static void main(String[] args) {
        Car0 first = new Car0();
        Car0 second = new Car0();
        Car0 third = new RacingCar0();

        List<Car0> myCars = new ArrayList<>();
        myCars.add(first);
        myCars.add(second);
        myCars.add(third);

        for(Car0 car : myCars){
            //todo Note this will fail for the third car
            // of the type RacingCar0
            System.out.println(car.getCabinWidth());
        }

    }
}
