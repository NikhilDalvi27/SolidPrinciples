package Liskov_BreakingTheHierarchy;

public class Car1 extends Vehicle {

    double cabinWidth = 141.34;

    @Override
    public double getInteriorWidth() {
        return this.getCabinWidth();
    }
    public double getCabinWidth(){
        return cabinWidth;
    }
}
