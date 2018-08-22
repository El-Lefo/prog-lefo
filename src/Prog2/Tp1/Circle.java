package Prog2.Tp1;



public class Circle {

    private Point2D center;
    private double radio;

    public Circle (double radio, Point2D center){
        this.radio = radio;
        this.center = center;
    }

    public Point2D getCenter() {
        return center;
    }

    public double area(){
        return ((Math.PI)*(Math.pow(radio,2)));
    }

    public boolean contains(Point2D point){
        if (radio <= center.getDistance(point)){
            return true;
        }
        return false;
    }

    public double perimeter (){
        return ((Math.PI)*(2*radio));
    }
}