package Liskov_BreakingTheHierarchy;

import java.util.ArrayList;
import java.util.List;

public class CarUtils1 {
    public static void main(String[] args) {
        //todo Note here all the references are
        // of the type Vehicle
        Vehicle first = new Car1();
        Vehicle second = new Car1();
        Vehicle third = new RacingCar1();

        List<Vehicle> myCars = new ArrayList<>();
        myCars.add(first);
        myCars.add(second);
        myCars.add(third);

        for(Vehicle vehicle : myCars){
            //todo Note this will run smoothly because
            // even racing car object has a method getInteriorWidth
            System.out.println(vehicle.getInteriorWidth());
        }

    }
}
