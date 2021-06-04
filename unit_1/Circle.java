package unit_1;

import java.lang.Math;
public class Circle {
    private int radius;

    public Circle(int CircRadius){
        radius = CircRadius;
    }
    public static void main(String[] args){
        Circle myCircle = new Circle(6);
        System.out.println("The circle's area is " + getArea(myCircle.radius));
    }

    public static double getArea(int r) {
        double area = Math.pow(r, 2) * Math.PI;
        return area;
    }

}
