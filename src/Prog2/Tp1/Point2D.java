package Prog2.Tp1;




public class Point2D {

    private double x;
    private double y;


    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getDistance(Point2D p){
        return Math.abs(Math.sqrt( Math.pow((x - p.getX()), 2) + Math.pow((y - p.getY()), 2)));
    }

    public Point2D add(Point2D p){
        return new Point2D(x + p.getX(), y + p.getY());
    }

}
