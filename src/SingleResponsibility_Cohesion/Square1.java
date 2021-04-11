package SingleResponsibility_Cohesion;


//todo here the responsibility of square class is to deal only with
// Measurements related to square
public class Square1 {
    int side = 5;


    //todo calcuateArea and calcualte Perimeter have high level of cohesion
    public int calculateArea(){
        return side*side;
    }

    public int calculatePerimeter(){
        return side*4;
    }
}
