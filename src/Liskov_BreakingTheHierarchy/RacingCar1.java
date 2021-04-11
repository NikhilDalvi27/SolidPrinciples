package Liskov_BreakingTheHierarchy;

public class RacingCar1 extends Vehicle {
    double cockPitWidth = 234.8;

    @Override
    public double getInteriorWidth() {
        return this.getCockpitWidth();
    }

    public double getCockpitWidth(){
        return cockPitWidth;
    }
}
