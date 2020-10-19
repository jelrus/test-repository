package com.company;
import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public double circleSquare(double radius){
        return PI*Math.pow(radius,2);
    }
    public double circleLength(double radius){
        return 2*PI*radius;
    }
}
