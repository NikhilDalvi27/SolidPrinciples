package SingleResponsibility_Cohesion;

public class Square0 {
    int side = 5;


    //todo calcuateArea and calcualte Perimeter have high level of cohesion
    public int calculateArea(){
        return side*side;
    }

    public int calculatePerimeter(){
        return side*4;
    }

    //todo Above 2 methods have low cohesion as compared to Below 2 methods


    //todo draw and rotate method deal with rendering and hence
    // have high level of cohesion
    public void draw(){
        boolean highestResolutionMonitor=true;
        if(highestResolutionMonitor){

        }else {

        }
    }

    public void rotate(int degree){

    }

}
