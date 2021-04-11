package Liskov_BreakingTheHierarchy;

public class RacingCar0 extends Car0 {
    double cockPitWidth = 234.8;
    public double getCabinWidth(){
        return 0.0;
    }
    public double getCockPitWidth(){
        return cockPitWidth;
    }

}
